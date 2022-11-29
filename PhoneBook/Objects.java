package PhoneBook;

import java.util.Scanner;

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
        Scanner valid = new Scanner(System.in);
        System.out.println("Enter the Whole address to see if the entry is valid: ");
        String address = valid.nextLine();

    };
}

class Main {

    public static void main(String[] args) {
        AddressClass obj = new AddressClass();

        obj.getAddress();
    }
}