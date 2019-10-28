import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Week8_Task2
 */
public class Week8_Task2 {
    public void NPEx() throws NullPointerException {
        int[] a = null;
        int x = a.length * 2;
    }
    public String NPExTest() {
        try {
            NPEx();
            return "Không có lỗi";
        } catch (NullPointerException nullPointerEx) {
            return "Lỗi Null Pointer";
        } 
    }

    public void AIOoBEx() throws ArrayIndexOutOfBoundsException {
        int[] a = {0, 1, 2};
        a[3] = a[0] + a[1];
    }

    public String AIOoBExTest() {
        try {
            AIOoBEx();
            return "Không có lỗi";
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            return "Lỗi Array Index Out of Bounds";
        } 
    } 

    public void ArithEx() throws ArithmeticException {
        int a = 10 / 0;
    }

    public String ArithExTest() {
        try {
            ArithEx();
            return "Không có lỗi";
        } catch (ArithmeticException arithmeticException) {
            return "Lỗi Arithmetic";
        } 
    }

    public void FNFEx() throws FileNotFoundException {
        FileReader in = new FileReader("./Bien.txt");
        //in.close();
    }

    public String FNFExTest() {
        try {
            FNFEx();
            return "Không có lỗi";
        } catch(FileNotFoundException fileNotFoundException) {
            return "Lỗi File Not Found";
        }
    }

    public void IOEx() throws IOException {
        FileReader in = new FileReader("./Bien.txt");
    } 

    public String IOExTest() {
        try {
            IOEx();
            return "Không có lỗi";
        } catch (IOException ioException) {
            return "Lỗi IO";
        }
    }
    public static void main(String[] args) {
        Week8_Task2 week8_Task2 = new Week8_Task2();
        System.out.println(week8_Task2.NPExTest());
        System.out.println(week8_Task2.ArithExTest());
        System.out.println(week8_Task2.FNFExTest());
        System.out.println(week8_Task2.AIOoBExTest());
        System.out.println(week8_Task2.IOExTest());

    }
}