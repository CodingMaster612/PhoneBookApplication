package PhoneBook;

import java.util.Scanner;

public class Persontwo {
    public static void main(String[] args) {

    }

    String Last;
    String First;

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
        System.out.println("Enter The full name you want to search for: ");
        String Full = FullName.nextLine();

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
