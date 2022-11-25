package PhoneBook;

import java.util.Scanner;

public class Addresstwo {
    String State;
    String city;

    public void SearchForState() {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter The first State you want to search for: ");
        String State = console.nextLine();
    }

    public void SearchForCity() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter The first city you want to search for: ");
        String City = scr.nextLine();

    }

}

class Statement extends Addresstwo {
    public void Display() {

    }
}

class City extends Addresstwo {
    public void Display() {

    }
}
