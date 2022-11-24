package PhoneBook;

public class Address {
    private String address;
    private String state;
    private int zipCode;

    public Address(String address, String state, int zipCode) {
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

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
