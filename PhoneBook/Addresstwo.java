package PhoneBook;

import java.util.Scanner;

public class Addresstwo {
    String State;
    String city;
    int zip;
    int phoneNumber;

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

    public void SearchForZip() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The zip code you want to search for: ");
        int zip = scanner.nextInt();
    }

    public void SearchForNumber() {
        Scanner scannerNum = new Scanner(System.in);
        System.out.println("Enter The Number code you want to search for: ");
        int number = scannerNum.nextInt();
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

class Zip extends Addresstwo {
    public void Display() {

    }
}

class phoneNumber extends Addresstwo {
    public void Display() {

    }
}