public class Staff extends Person {
    private String school;
    private double pay;
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }
    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }
    /**
     * @return the pay
     */
    public double getPay() {
        return pay;
    }
    /**
     * @param pay the pay to set
     */
    public void setPay(double pay) {
        this.pay = pay;
    }
    @Override
    public String toString() {
        return String.format("Staff[%s,school=%s,pay=%f]", super.toString(), this.school, this.pay);
    }
    public static void main(String[] args) {
        Staff staff = new Staff("Bien", "Hai Duong", "UET", 200);
        System.out.println(staff);
    }
}