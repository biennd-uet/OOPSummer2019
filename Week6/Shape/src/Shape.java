public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape() {
        //this("red", false);
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
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
	System.out.println(s1);
	System.out.println(s1.getArea());
	System.out.println(s1.getPerimeter());
	System.out.println(s1.getColor());
	System.out.println(s1.isFilled());
	System.out.println(((Circle) s1).getRadius());
	
	Circle c1 = (Circle)s1;
	System.out.println(c1);
	System.out.println(c1.getArea());
	System.out.println(c1.getPerimeter());
	System.out.println(c1.getColor());
	System.out.println(c1.isFilled());
	System.out.println(c1.getRadius());
	
	//Shape s2 = new Shape();
	
	Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
	System.out.println(s3);
	System.out.println(s3.getArea());
	System.out.println(s3.getPerimeter());
	System.out.println(s3.getColor());
	System.out.println(((Rectangle) s3).getLength());
	
	Rectangle r1 = (Rectangle)s3;
	System.out.println(r1);
	System.out.println(r1.getArea());
	System.out.println(r1.getColor());
	System.out.println(r1.getLength());
	
	Shape s4 = new Square(6.6);
	System.out.println(s4);
	System.out.println(s4.getArea());
	System.out.println(s4.getColor());
	System.out.println(((Square) s4).getSide());
	
	Rectangle r2 = (Rectangle)s4;
	System.out.println(r2);
	System.out.println(r2.getArea());
	System.out.println(r2.getColor());
	//System.out.println(((Square) r2).getSide());
	System.out.println(r2.getLength());
	
	Square sq1 = (Square)r2;
	System.out.println(sq1);
	System.out.println(sq1.getArea());
	System.out.println(sq1.getColor());
	System.out.println(sq1.getSide());
	System.out.println(sq1.getLength());
    }
}