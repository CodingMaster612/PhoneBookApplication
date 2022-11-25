package PhoneBook;

import java.util.Scanner;

public class Persontwo {
    public static void main(String[] args) {

    }

    String Last;
    String First;
    String Full;

    public void SearchForFirst() {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter The first name you want to search for: ");
        String First = console.nextLine();

    }

    public void SearchForLast() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter The last name you want to search for: ");
        String Last = scr.nextLine();

    }

    public void SearchForFullName() {
        Scanner FullName = new Scanner(System.in);
        System.out.println("Enter The the key word FullName to search for info: ");
        String Full = FullName.nextLine();

        City city = new City();
        Statement state = new Statement();
        Zip zip = new Zip();
        phoneNumber number = new phoneNumber();

        if (Full.equals("FullName")) {
            System.out.println(Full + city + state + zip + number);
        }

    }

}

class lastName extends Persontwo {
    public void Display() {

    }
}

class firstName extends Persontwo {
    public void Display() {

    }
}

class FullName extends Persontwo {
    public void Display() {

    }
}
