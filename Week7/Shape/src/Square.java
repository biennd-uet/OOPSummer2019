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
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
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
        return String.format("Square[topLeft=%s,side=%.1f,color=%s,filled=%b]"
                    , this.topLeft.toString(), this.length, this.color, this.filled);
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public static void main(String[] args) {
        Double p = -10.0;
        System.out.println(p.hashCode());
        Double c = 10.0;
        System.out.println(c.hashCode());
    }
}
