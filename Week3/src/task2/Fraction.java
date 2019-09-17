
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * @return the denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * @param denominator the denominator to set
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            return ;
        }
        this.denominator = denominator;
    }

    /**
     * @return the numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * @param numerator the numerator to set
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }


    public Fraction() {
        this(0, 1);
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction fraction) {
        this.denominator = fraction.denominator;
        this.numerator = fraction.numerator;
    }
    
    private int gcd(int a, int b) {
        while (b > 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    public Fraction reduce() {
        int gcdFraction = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / gcdFraction;
        this.denominator = this.denominator / gcdFraction;
        return this;
    }

    // add
    public Fraction add(Fraction other) {

        int numerator = this.numerator * other.denominator + this.denominator * other.numerator; 
        int denominator = this.denominator * other.denominator;
        this.numerator = numerator;
        this.denominator = denominator;
        return this;
    }

    // subtract
    public Fraction subtract(Fraction other) {
        int numerator = this.numerator * other.denominator - this.denominator * other.numerator; 
        int denominator = this.denominator * other.denominator;
        this.numerator = numerator;
        this.denominator = denominator;
        return this;
    }

    // multiple
    public Fraction multiply(Fraction other) {
        int numerator = this.numerator * other.numerator;
        int denominator =  this.denominator * other.denominator;
        this.numerator = numerator;
        this.denominator = denominator;
        return this;
    }

    // divide
    public Fraction divide(Fraction other) {
        if (other.equals(new Fraction(0, 1))) {
            return this;
        }
        int numerator = this.numerator * other.denominator;
        int denominator = this.denominator * other.numerator;
        this.denominator = denominator;
        this.numerator = numerator;
        return this;
    }

    /**
     * compare this with other, notice that param is Object type
     */
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (obj instanceof Fraction) {
            Fraction tmp = (Fraction) obj;
            tmp.reduce();
            return this.denominator * tmp.numerator == tmp.denominator * this.numerator; 
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.numerator + " \\ " + this.denominator;
    }

    public static void main(String[] args) {
        Fraction a = new Fraction(2, 3);
        Fraction b = new Fraction(3, 4);
        Fraction c = new Fraction(4, 6);
        System.out.println(a.equals(c));
        System.out.println(a.add(b));

    }
}