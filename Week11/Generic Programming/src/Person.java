import java.util.ArrayList;
import java.util.List;

/**
 * Person
 */
public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {

    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person person) {
        if (!this.name.equals(person.name)) {
            return this.name.compareTo(person.name);
        } else if (!(this.age == person.age)) {
            return this.age - person.age;
        } else {
            return this.address.compareTo(person.address);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %s\n", this.name, this.age, this.address);
    }

    public static void main(String[] args) {
        Person person1 =  new Person("Nguyen A", 22, "...");
        Person person2 =  new Person("Nguyen A", 20, "...");
        Person person3 =  new Person("Le B", 20, "...");

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        Week11.sortGeneric(persons);

        persons.forEach(System.out::println);
    }
    
}
