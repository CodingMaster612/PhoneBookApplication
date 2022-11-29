package PhoneBook;

public class Objects {

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}

class AddressClass extends Objects {
    public AddressClass() {
        super();
    }

    public void getAddress() {

        System.out.println("");

    }

}

class PersonClass extends Objects {
    public void display() {

    }
}

class Main {

    public static void main(String[] args) {
        AddressClass obj = new AddressClass();

        obj.getAddress();
    }
}