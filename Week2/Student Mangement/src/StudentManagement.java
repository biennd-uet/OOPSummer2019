import java.util.Arrays;

public class StudentManagement {
    private Student[] students;
    private int numberOfStudent; 
    //private Set<String> listClass = new TreeSet<String>();

    public StudentManagement() {
        students = new Student[100];
        numberOfStudent = 0;
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        numberOfStudent++;
        students[numberOfStudent - 1] = newStudent;
    }

    public String studentsByGroup() {
        StringBuilder result = new StringBuilder("");
        /*for(String group :  listClass) {
            result.append(group + "\n");
            for(int i = 0; i < numberOfStudent; i++){
                if (students[i].getGroup().equals(group)) {
                result.append(students[i].getInfo() + "\n");
                }
            }
        } */
        boolean[] isPrinted = new boolean[100];
        Arrays.fill(isPrinted, false);
        for(int i = 0; i < numberOfStudent; i++) {
            if (isPrinted[i] == false) {
                result.append(students[i].getGroup() + "\n");
                for(int j = i; j < numberOfStudent; j++) {
                    if (students[j].getGroup().equals(students[i].getGroup())) {
                            result.append(students[j].getInfo() + "\n");
                            isPrinted[j] = true;
                    }
                }
            }
        }
        
        return result.toString();
    }

    public void removeStudent(String id) {
        int position = -1;
        for(int i = 0; i < numberOfStudent; i++) {
            if (students[i].getId().equals(id)) {
                position = i;
                break;
            }
        }
        if (position == -1)
            return;
        for(int i = position + 1; i < numberOfStudent; i++) {
            students[i - 1] = students[i];
        }
        students[numberOfStudent - 1] = null;
        numberOfStudent--;
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent(new Student("Bien", "18020210", "18020210@vnu.edu.vn"));
        studentManagement.addStudent(new Student("Dinh", "18020305", "18020305@vnu.edu.vn"));
        System.out.println(studentManagement.studentsByGroup());
        studentManagement.removeStudent("18020210");
        System.out.println(studentManagement.studentsByGroup());
    }
}