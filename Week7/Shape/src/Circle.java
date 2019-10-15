import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
    protected double radius;
    protected final double PI = Math.PI;
    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
        this.center = new Point(0, 0);
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = new Point(0, 0);
    }
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }
    /**
     * @return the center
     */
    public Point getCenter() {
        return center;
    }
    /**
     * @param center the center to set
     */
    public void setCenter(Point center) {
        this.center = center;
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
    public int hashCode() {
        return Objects.hash(this.center, this.radius);
    }
    @Override
    public String toString() {
        return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%b]"
                        , this.center.toString(), this.radius, this.color, this.filled);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle tmp = (Circle) obj;
            return this.center.equals(tmp.center)
                && super.isDoubleEquals(this.radius, tmp.radius);
        } else {
            return false;
        }
    }
}
