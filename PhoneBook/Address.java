package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class Address {
    private String address;
    private String state;
    private String zipCode;

    List<String> add = new ArrayList<>();

    public Address() {
        super();
    }

    public Address(String address, String state, String zipCode) {
        super();
        this.address = address;
        this.state = state;
        this.zipCode = zipCode;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public List<String> getAdd() {
        return add;
    }

    public void setAdd(List<String> add) {
        this.add = add;
    }

    public String toString() {
        return address + state + zipCode;
    }

}