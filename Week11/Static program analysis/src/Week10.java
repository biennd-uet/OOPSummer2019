import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Week10
 */
public class Week10 {

    private static String getPackage(String fileContent) {
        final String regex = "package (.*);";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(fileContent);

        if(matcher.find()) {
            return matcher.group(1);
        } else {
            return null;
        }
    }

    private static List<String> getAllClassAreDeclaration(String fileContent) {
        List<String> result = new ArrayList<>();
        final String regex = "(?:public|private|protected)?\\s*(?:static)?\\s*(?:class|interface)\\s+(\\w+)\\s+\\{\\n";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(fileContent);

        while (matcher.find()) {
            result.add(matcher.group(1));
        }
        return result;
    }

    private static Map<String, String> getAllClassImport(String fileContent) {
        Map<String, String> result = new HashMap<>();
        final String regex = "import ((?:(?:\\w+)\\.(?:\\w+\\.)+)(\\w+));";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(fileContent);
        while (matcher.find()) {
            result.put(matcher.group(2), matcher.group(1));
        }

        return result;
    }

    private static String getFullName(String className, Map<String, String> mapNameClassToFullPath) {


        if(mapNameClassToFullPath.containsKey(className)) {
            return mapNameClassToFullPath.get(className);
        } else if(className.matches("[A-Z]\\w+")) {
            return String.format("java.lang.%s", className);
        } else if(className.matches("\\w+(?:\\<.*\\>)?")) {
            Pattern pattern = Pattern.compile("(\\w+)(?:\\<(.*)\\>)?");
            Matcher matcher = pattern.matcher(className);
            matcher.find();
            return String.format("%s<%s>", getFullName(matcher.group(1), mapNameClassToFullPath), getFullName(matcher.group(2), mapNameClassToFullPath));
        } else {
            return className;
        }
    }

    public List<String> getAllFunctions(String fileContent) {
        List<String> listFunction = new ArrayList<>();
        Map<String, String> mapNameClassToFullPath = new HashMap<>();

        mapNameClassToFullPath.putAll(getAllClassImport(fileContent));
        String thisPackage = getPackage(fileContent);
        List<String> allClassDeclaration = getAllClassAreDeclaration(fileContent);

        allClassDeclaration.forEach(classes -> mapNameClassToFullPath.put(classes, String.format("%s.%s", thisPackage, classes)));


        final String regexCaptureFunction = "^\\s+(?:public|private|protected)?\\s+(?:static)\\s+\\w+(?:\\<[\\w\\d\\,\\.\\<\\>\\s\\?]*\\>)?(?:\\[\\])?\\s+(\\w+)\\(([\\w\\d\\s\\,\\<\\>\\?\\\\.)]*)\\)\\s+";
        final Pattern pattern = Pattern.compile(regexCaptureFunction, Pattern.MULTILINE);
        final Matcher mathFunction = pattern.matcher(fileContent);

        final String regexListParameter = "((\\w+(\\<([\\w\\?]+\\s*(?:\\,\\s+[\\w\\?]+)*)\\>)?(?:\\.{3})?)\\s+\\w+)((?:\\,(?:\\s+((\\w+(\\<([\\w\\?]+\\s*(?:\\,\\s+[\\w\\?]+)*)\\>)?(?:\\.{3})?)\\s+\\w+)))*)";
        final Pattern patternListParameter = Pattern.compile(regexListParameter);

        final String regexOtherParameter = "\\,\\s*((\\w+(\\<(\\w+\\s*(?:\\,\\s+\\w+)*)\\>)?)(?:\\.{3})?\\s+\\w+)\\s*";
        final Pattern patternOtherParameter = Pattern.compile(regexOtherParameter);

        while (mathFunction.find()) {
            StringBuilder functionDetail = new StringBuilder(mathFunction.group(1));
            functionDetail.append('(');

            if(mathFunction.group(2) != null) {
                final Matcher matchParameter = patternListParameter.matcher(mathFunction.group(2));

                if(matchParameter.find()) {
                    if(matchParameter.group(1) != null) {
                        System.out.println(matchParameter.group(2));
                        functionDetail.append(getFullName(matchParameter.group(2), mapNameClassToFullPath));
                        functionDetail.append(',');
                    }

                    if(matchParameter.group(5) != null) {
                        final Matcher mathOtherParameter = patternOtherParameter.matcher(matchParameter.group(5));

                        while (mathOtherParameter.find()) { ;
                            functionDetail.append(getFullName(mathOtherParameter.group(2), mapNameClassToFullPath));
                            functionDetail.append(',');
                        }

                    }
                    functionDetail.delete(functionDetail.length() - 1, functionDetail.length());
                }
            }

            functionDetail.append(')');
            listFunction.add(functionDetail.toString());
        }

        return listFunction;
    }

    public static void main(String[] args) {
        List<String> functions = (new Week10()).getAllFunctions("");
        System.out.println(functions);
    }
}
