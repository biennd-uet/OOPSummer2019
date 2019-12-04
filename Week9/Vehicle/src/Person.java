
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * test.Person
 */
public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        vehicleList = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }

    public void removeVehicle(String registrationNumber) {
        Predicate<Vehicle> isVehicleToDelete = (Vehicle vehicle) -> {
            return vehicle.getRegistrationNumber().compareTo(registrationNumber) == 0;
        };
        this.vehicleList.removeIf(isVehicleToDelete);
    }

    /**
     * @return the vehicleList
     */
    public String getVehiclesInfo() {
        if (this.vehicleList.size() == 0) {
            return String.format("%s has no vehicle!", this.name);
        } else {
            StringBuilder result = new StringBuilder(String.format("%s has:\n\n", this.name));
            for (Vehicle vehicle : vehicleList) {
                result.append(vehicle.getInfo());
            }
            return result.toString();
        }
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
        return String.format("%s - %s", this.name, this.address);
    }

    public static void main(String[] args) {
        Person person = new Person("Nguyen Van A", "144 Xuan Thuy, Cau Giay, HN");
        person.addVehicle(new Car("Mercedes-Benz", "S400", "30A - 888.88", person, 4));
        person.addVehicle(new MotorBike("Yamaha", "YZF-R6", "29 - P1 686.68", person, false));

        System.out.println(person.getVehiclesInfo());

        person.removeVehicle("30A - 888.88");
        System.out.println(person.getVehiclesInfo());
    }
}