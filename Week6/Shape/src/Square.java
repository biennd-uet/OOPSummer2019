public class Square extends Rectangle {
    public Square() {
        this(1.0);
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return this.length;
    }
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side) {
        this.setSide(side);
    }
    @Override
    public void setLength(double side) {
        this.setSide(side);
    }
    @Override
    public String toString() {
        return String.format("Square[side=%.1f,color=%s,filled=%b]", this.length, this.color, this.filled);
    }
}