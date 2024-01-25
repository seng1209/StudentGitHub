package Assignment;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;
    public Person(){
        this.address = "N/A";
        this.name = "N/A";
    }
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
}
