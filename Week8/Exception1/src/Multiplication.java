/**
 * Multiplication
 */
public class Multiplication extends BinaryExpression {
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public String toString() {
        return String.format("(%s * %s)", this.left, this.right);
    }
    @Override
    public double evaluate() {
        return this.left.evaluate() * this.right.evaluate();
    }
    
}