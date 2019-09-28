public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * @return the fee
     */
    public double getFee() {
        return fee;
    }
    /**
     * @param fee the fee to set
     */
    public void setFee(double fee) {
        this.fee = fee;
    }
    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }
    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }
    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }
    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return String.format("Student[%s,program=%s,year=%d,fee=%f]", super.toString(), this.program, this.year, this.fee);
    }

    public static void main(String[] args) {
        Student student = new Student("Bien", "Hai Duong", "Bachelor", 2018, 10);
        System.out.println(student);
    }

}