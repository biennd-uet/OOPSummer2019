public class Cylinder extends Circle {
    private double height;
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        this(radius, 1.0);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + 2 * this.PI * super.getRadius() * this.height;
    }
    @Override
    public String toString() {
        return String.format("Cylinder[%s],height=%f]", super.toString(), this.height);
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.0, 1.0);
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}