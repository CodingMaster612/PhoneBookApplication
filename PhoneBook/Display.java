package PhoneBook;

import java.rmi.server.SocketSecurityException;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        String directions;
        int count = 0;
        List<String> names = new ArrayList<>();

        while (true) {
            Scanner console = new Scanner(System.in);

            System.out.println("Please enter your selection: (q to Quit): ");
            System.out.println("---------------------------------------------");
            System.out.println("ADD-ENTRIES: Type Add");
            System.out.println("---------------------------------------------");
            System.out.println("SEARCH-ENTRIES: Type Search");
            System.out.println("---------------------------------------------");
            System.out.println("DELETE-ENTRIES: Type delete");
            System.out.println("---------------------------------------------");
            System.out.println("UPDATE=ENTRIES: Type update ");
            System.out.println("---------------------------------------------");
            System.out.println("SHOW-IN-ORDER: Type Show ");
            // System.out.println("EXIT: ");

            directions = console.nextLine();

            if (directions.equals("q")) {
                System.out.println("Program Terminated");
                break;
            }

            if (directions.equals("Add")) {
                // add a while loop
                Scanner con = new Scanner(System.in);

                System.out.println("Enter a name");
                String name = con.nextLine();

                names.add(name);

                System.out.println("Enter a last name");
                String lastName = con.nextLine();

                names.add(lastName);

            }
            if (directions.equals("Search")) {
                // function to search
                firstName First = new firstName();
                lastName Last = new lastName();
                FullName Full = new FullName();
                First.SearchForFirst();
                Last.SearchForLast();
                Full.SearchForFullName();

                City city = new City();
                Statement state = new Statement();
                state.SearchForState();
                city.SearchForCity();

            }
            if (directions.equals("delete")) {
                // function to delete
            }
            if (directions.equals("update")) {
                // function to update
            }
            if (directions.equals("Show")) {
                // function to Show
                for (int i = 0; i < names.size(); i++) {

                    System.out.println(names.get(i) + " " + count + " " + "Log---");
                    count++;
                }
            }

        }

    }

}
