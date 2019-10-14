import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;
    public Rectangle() {
        this(1.0, 1.0);
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
        this.topLeft = new Point(0, 0);
    }
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }
    /**
     * @return the topLeft
     */
    public Point getTopLeft() {
        return topLeft;
    }
    /**
     * @param topLeft the topLeft to set
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
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
    public int hashCode() {
        return Objects.hash(this.topLeft, this.length, this.width);
    }
    @Override
    public String toString() {
        return String.format("Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%b]"
                    ,this.topLeft.toString(), this.width, this.length, this.color, this.filled);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle tmp = (Rectangle) obj;
            return this.topLeft.equals(tmp.topLeft)
                && super.isDoubleEquals(this.length, tmp.length)
                && super.isDoubleEquals(this.width, tmp.width);
        } else {
            return false;
        }

    }
}
