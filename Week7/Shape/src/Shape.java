public abstract class Shape {
    protected String color;
    protected boolean filled;
    final private double EPSILON = 1e-4;
    public Shape() {
        this("red", false);
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }
    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return String.format("Shape[color=%s,filled=%b]", this.color, this.filled);
    }
    protected boolean isDoubleEquals(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }
    public static void main(String[] args) {
    }
}
