public class Circle {
    private double radius;
    private String color;
    protected final double PI = 3.14159;

    public Circle() {
        this(1.0, "red");
    }

    public Circle(double radius) {
        this(radius, "red");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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

    public double getArea() {
        return this.radius * this.radius * this.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%f,color=%s]", this.radius, this.color);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(20, "blue");
        System.out.println(circle);
        System.out.println(circle.getArea());
    }
}