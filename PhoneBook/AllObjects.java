package PhoneBook;

public class AllObjects {
    private String lastName;
    private String firstName;
    private String fullName;
    private String city;
    private String state;
    private int phoneNumber;
    private int zip;

    public AllObjects() {
        super();
    }

    public AllObjects(String firstName, String lastName, String fullName, String city, String state, int zip,
            int phoneNumber) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.zip = zip;

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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String toString() {
        return "Idenity:[FirstName] " + firstName + "[LastName] " + lastName;
    }

}