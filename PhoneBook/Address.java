package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class Address {
    private int address;
    private String state;
    private int zipCode;

    List<Integer> add = new ArrayList<>();

    public Address() {
        super();
    }

    public Address(int address, String state, int zipCode) {
        super();
        this.address = address;
        this.state = state;
        this.zipCode = zipCode;

    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Address(List<Integer> add) {

    }

}