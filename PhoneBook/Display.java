package PhoneBook;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        String directions;
        while (true) {
            Scanner console = new Scanner(System.in);

            System.out.println("Please enter your selection: (q to Quit): ");
            System.out.println("ADD-ENTRIES:");
            System.out.println("SEARCH-ENTRIES:");
            System.out.println("DELETE-ENTRIES:");
            System.out.println("UPDATE=ENTRIES: ");
            System.out.println("SHOW-IN-ORDER: ");
            // System.out.println("EXIT: ");

            directions = console.nextLine();

            if (directions.equals("q")) {
                System.out.println("Program Terminated");
                break;
            }
            
            


        }

        

    }

}
