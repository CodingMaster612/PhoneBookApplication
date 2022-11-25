package PhoneBook;

import java.rmi.server.SocketSecurityException;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        String directions;
        int count = 0;
        List<String> Objects = new ArrayList<>();
        // List<Integer> address = new ArrayList<>();

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

                Objects.add(name);

                System.out.println("Enter a last name");
                String lastName = con.nextLine();

                Objects.add(lastName);
                // System.out.println("Complete full name entry:");

                System.out.println("Enter a City name");
                String city = con.nextLine();

                Objects.add(city);

                System.out.println("Enter a State name");
                String state = con.nextLine();

                Objects.add(state);

                System.out.println("Enter a zip code");
                String zip = con.nextLine();

                Objects.add(zip);

                System.out.println("Enter a number code");
                String number = con.nextLine();

                Objects.add(number);

                // System.out.println("Full name, city, state, zip , Phone");
                Objects.add(name + " ," + lastName + ", " + city + ", " + state
                        + " ," + zip + ", " + number);
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
                Zip zip = new Zip();
                phoneNumber number = new phoneNumber();
                state.SearchForState();
                city.SearchForCity();
                zip.SearchForZip();
                number.SearchForNumber();

                // Scanner word = new Scanner(System.in);
                // System.out.println("Enter a keyword to find information");
                // String words = word.nextLine();

                // if (words.equals("FirstName")) {
                // System.out.println(First + " ," + Last + ", " + city + ", " + state
                // + " ," + zip + ", " + number);
                // }

            }
            if (directions.equals("delete")) {
                Scanner delete = new Scanner(System.in);
                System.out.println("Choose what element to delete");
                String item = delete.nextLine();

                for (int i = 0; i < Objects.size(); i++) {

                    Objects.remove(item);

                }

            }
            if (directions.equals("update")) {
                // function to update
            }
            if (directions.equals("Show")) {
                // function to Show
                for (int i = 0; i < Objects.size(); i++) {

                    System.out.println(Objects.get(i) + " " + count + " " + "Log---");
                    count++;
                }
            }

        }

    }

}
