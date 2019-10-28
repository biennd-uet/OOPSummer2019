/**
 * Division
 */
public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public String toString() {
        return String.format("(%s / %s)", this.left, this.right);
    }
    @Override
    public double evaluate() {
        if (this.right.evaluate() == 0.0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return this.left.evaluate() / this.right.evaluate();
    }
}