package PhoneBook;

public class Objects {

    String info;

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

        System.out.println(info);

    }

}

class PersonClass extends Objects {
    public void display() {

    }

}

class ValidEntry extends Objects {
    public void isValid() {

    };
}

class Main {

    public static void main(String[] args) {
        AddressClass obj = new AddressClass();

        obj.getAddress();
    }
}