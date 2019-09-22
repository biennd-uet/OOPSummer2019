import org.junit.Assert;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        Assert.assertEquals("Wrong Answer", 2, Week4.max2Int(1, 2));
    }

    @Test
    public void testMax2Int2(){
        Assert.assertEquals("Wrong Answer", 10, Week4.max2Int(- 1, 10));
    }

    @Test
    public void testMax2Int3(){
        Assert.assertEquals("Wrong Answer", -10, Week4.max2Int(-10, -1000));
    }

    @Test
    public void testMax2Int4(){
        Assert.assertEquals("Wrong Answer", 0, Week4.max2Int(0, 0));
    }

    @Test
    public void testMax2Int5(){
        Assert.assertEquals("Wrong Answer", 0, Week4.max2Int(-10, 0));
    }

    @Test
    public void testMinArray1(){
        int[] arr = {1, 2, 3};
        Assert.assertEquals("Wrong Answer", 1,Week4.minArray(arr));
    }

    @Test
    public void testMinArray2(){
        int[] arr = {-1, -2, -3};
        Assert.assertEquals("Wrong Answer", -3,Week4.minArray(arr));
    }

    @Test
    public void testMinArray3(){
        int[] arr = {-3, -2, -1, 1, 2, 3};
        Assert.assertEquals("Wrong Answer", -3,Week4.minArray(arr));
    }

    @Test
    public void testMinArray4(){
        int[] arr = {1, 1, 1, 1};
        Assert.assertEquals("Wrong Answer", 1,Week4.minArray(arr));
    }

    @Test
    public void testMinArray5(){
        int[] arr = {0, 0, -1, 1};
        Assert.assertEquals("Wrong Answer", -1,Week4.minArray(arr));
    }

    @Test
    public void testCalculateBMI1(){
        Assert.assertEquals("Wrong Answer", "Bình thường",Week4.calculateBMI(58, 1.70));
    }

    @Test
    public void testCalculateBMI2(){
        System.out.println(Week4.calculateBMI(58, 1.70));
        Assert.assertEquals("Wrong Answer", "Bình thường",Week4.calculateBMI(58, 1.70));
    }

    @Test
    public void testCalculateBMI3(){
        Assert.assertEquals("Wrong Answer", "Thừa cân",Week4.calculateBMI(70, 1.70));
    }

    @Test
    public void testCalculateBMI4(){
        Assert.assertEquals("Wrong Answer", "Béo phì",Week4.calculateBMI(90, 1.70));
    }

    @Test
    public void testCalculateBMI5(){
        Assert.assertEquals("Wrong Answer", "Thiếu cân",Week4.calculateBMI(40, 1.50));
    }
}