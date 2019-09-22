import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

public class Week4 {
    /**
     * @author Bien
     * @param a first integer number
     * @param b second integer number
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        IntBinaryOperator lambdaFunction = (int f, int s)->Math.max(f, s);
        return lambdaFunction.applyAsInt(a, b);
    }

    /**
     * @author Bien
     * @param arr list number stored in this array
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int minValue = arr[0];
        for(int x : arr) {
            if (x < minValue) {
                minValue = x;
            }
        }
        return minValue;
    }

    /**
     * @author Bien
     * @param weight weight in kg
     * @param height height in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = (double) weight / (height * height);
        BMI = (double)  (Math.round(BMI * 10)) / 10;
        //System.out.println(BMI);
        if (BMI < 18.5) {
            return "Thiếu cân";
        }
        else if (BMI <= 22.9) {
            return "Bình thường";
        }
        else if (BMI <= 24.9) {
            return "Thừa cân";
        }
        else {
            return "Béo phì";
        }
    }
}