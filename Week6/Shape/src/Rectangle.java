public class Rectangle extends Shape {
    protected double width; 
    protected double length;
    public Rectangle() {
        this(1.0, 1.0);
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }
    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }
    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return this.length * this.width;
    }
    @Override
    public double getPerimeter() {
        return 2.0 * (this.width + this.length);
    }
    @Override
    public String toString() {
        return String.format("Rectangle[width=%.1f,length=%.1f,color=%s,filled=%b]", this.width, this.length, this.color, this.filled);
    }
}