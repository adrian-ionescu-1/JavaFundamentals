package Homework.Topic2;

public class User {
    private String name;
    private String address;
    private String cnp;

    public User(String name, String address, String cnp) {
        this.name = name;
        this.address = address;
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCNP() {
        return cnp;
    }
}
