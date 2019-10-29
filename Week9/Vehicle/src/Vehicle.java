public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    public Vehicle(String brand, String model, String registrationNumber, Person owner){
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }
    abstract public String getInfo();
    public void transferOwnership(Person newOwner) {
        setOwner(newOwner);
    }
    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }
    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }
    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    /**
     * @return the owner
     */
    public Person getOwner() {
        return owner;
    }
    /**
     * @param owner the owner to set
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    /**
     * @return the registrationNumber
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    /**
     * @param registrationNumber the registrationNumber to set
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}