public class Circle extends Shape {
    protected double radius;
    protected final double PI = Math.PI;
    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * this.radius * this.radius; 
    }
    @Override
    public double getPerimeter() {
        return 2.0 * PI * this.radius;
    }
    @Override
    public String toString() {
        return String.format("Circle[radius=%.1f,color=%s,filled=%b]", this.radius, this.color, this.filled);
    }
}