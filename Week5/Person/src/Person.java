public class Person {
    private String name;
    private String address;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return String.format("Person[name=%s,address=%s]", this.name, this.address);
    }
    public static void main(String[] args) {
        Person person = new Person("Bien", "Hai Duong");
        System.out.println(person);
    }
}