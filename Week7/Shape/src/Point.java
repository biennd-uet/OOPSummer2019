import java.util.Objects;

/**
 * Point
 */
public class Point {
    private final double ESPSLON = 1e-4;
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /**
     * @return the x
     */
    public double getX() {
        return x;
    }
    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }
    /**
     * @return the y
     */
    public double getY() {
        return y;
    }
    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
    /**
     *
     * @param other point will get distance.
     * @return distance of this instance with the point in descartes coordinates.
     */
    public double distance(Point other) {
        return Math.sqrt((this.x - other.x) * (this.x - other.x) + (this.y - other.y) * (this.y - other.y));
    }
    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (obj instanceof Point) {
            Point tmp = (Point) obj;
            return this.distance(tmp) < ESPSLON;
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }
    @Override
    public String toString() {
        return String.format("(%.1f,%.1f)", this.x, this.y);
    }

    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
