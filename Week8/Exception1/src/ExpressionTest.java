/**
 * ExpressionTest
 */
public class ExpressionTest {
    public static void main(String[] args) {
        Expression sum = new Square(new Addition(
            new Addition(new Square(new Numeral(10)),new Numeral(-3)),
            new Multiplication(new Numeral(4), new Numeral(3)))
        );
        System.out.printf("%s\n %f\n", sum.toString(), sum.evaluate());
    }
}