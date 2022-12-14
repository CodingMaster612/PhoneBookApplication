package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class AllObjects {
    private String lastName;
    private String firstName;
    private String fullName;
    private String city;
    private String state;
    private String phoneNumber;
    private String zip;
    private String valid;

    List<String> Objects = new ArrayList<>();

    public AllObjects() {
        super();
    }

    public AllObjects(String firstName, String lastName, String fullName, String city, String state, String zip,
            String phoneNumber, String valid) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.valid = valid;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String toString() {
        return "IDENTITY : [FIRST-NAME] " + firstName + " [LAST-NAME] " + lastName + " [FULL-NAME] " + fullName
                + " [CITY] " + city
                + " [STATE] " + state + " [ZIP] " + zip + " [PHONE-NUMBER] " + phoneNumber + " ";
    }

    public String infoOnFirstName() {
        return lastName + city + state + zip + phoneNumber;
    }

    public AllObjects(List<String> objects) {
        Objects = objects;

    }

}
