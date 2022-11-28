package PhoneBook;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        String directions;

        List<String> Objects = new ArrayList<>();
        // List<Integer> address = new ArrayList<>();

        while (true) {
            Scanner console = new Scanner(System.in);

            System.out.println("Please enter your selection: (q to Quit): ");
            System.out.println("---------------------------------------------");
            System.out.println("ADD-ENTRIES: Type Add");
            System.out.println("---------------------------------------------");
            System.out.println("SEARCH-ENTRIES: Type Search-By-Index");
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

            else if (directions.equals("Add")) {

                Scanner con = new Scanner(System.in);
                System.out.println("Directions: To Add a certain Object type in the desired keyword");

                System.out.println("###############################################");
                System.out.println(": Type Add-First");
                System.out.println("---------------------------------------------");
                System.out.println(": Type Add-Last");
                System.out.println("---------------------------------------------");
                System.out.println(": Type Add-City");
                System.out.println("---------------------------------------------");
                System.out.println(": Type Add-State ");
                System.out.println("---------------------------------------------");
                System.out.println(": Type Add-Zip ");
                System.out.println("---------------------------------------------");
                System.out.println(": Type Add-Number");
                System.out.println("###############################################");

                String information = con.nextLine();

                AllObjects Obj = new AllObjects();

                switch (information) {
                    case "Add-First":
                        System.out.println("Enter a name");
                        String name = con.nextLine();
                        Objects.add(new String(name));
                        Obj.setFirstName(name);

                        break;

                    case "Add-Last":
                        System.out.println("Enter a last name");
                        String lastName = con.nextLine();
                        Objects.add(new String(lastName));
                        Obj.setLastName(lastName);
                        break;

                    case "Add-City":
                        System.out.println("Enter a City name");
                        String city = con.nextLine();
                        Objects.add(new String(city));
                        Obj.setCity(city);
                        break;

                    case "Add-State":
                        System.out.println("Enter a State name");
                        String state = con.nextLine();
                        Objects.add(new String(state));
                        Obj.setState(state);
                        break;

                    case "Add-Zip":
                        System.out.println("Enter a zip code");
                        String zip = con.nextLine();
                        Objects.add(new String(zip));
                        Obj.setZip(zip);

                        break;

                    case "Add-Number":
                        System.out.println("Enter a number code");
                        String number = con.nextLine();
                        Objects.add(new String(number));
                        Obj.setPhoneNumber(number);
                        break;

                    default:

                        System.out.println("Invalid input");

                }
                // Obj.setFirstName(information);
                System.out.println(Objects.toString());

            } else if (directions.equals("Search-By-Index")) {

                Scanner scanner = new Scanner(System.in);
                AllObjects Obj = new AllObjects();

                System.out.println("Directions: To Search a certain Object type in the desired keyword");

                System.out.println("###############################################");
                System.out.println(": Type Index-(number): ");
                System.out.println("###############################################");

                int SearchInfo = scanner.nextInt();

                switch (SearchInfo) {
                    case 0:

                        String indexZero = Objects.get(0);
                        System.out.println(indexZero);

                        break;

                    case 1:
                        String indexTwo = Objects.get(1);
                        System.out.println(indexTwo);
                        break;

                    case 2:
                        String indexThree = Objects.get(2);
                        System.out.println(indexThree);
                        break;
                    case 3:
                        String indexFour = Objects.get(3);
                        System.out.println(indexFour);
                        break;
                    case 4:
                        String indexFive = Objects.get(4);
                        System.out.println(indexFive);
                        break;
                    case 5:
                        String indexSix = Objects.get(5);
                        System.out.println(indexSix);
                        break;
                    case 6:
                        String indexSeven = Objects.get(6);
                        System.out.println(indexSeven);
                        break;

                    default:
                        System.out.println("error");

                }

            }

            else if (directions.equals("delete")) {
                Scanner delete = new Scanner(System.in);
                System.out.println("Choose what element to delete");
                String item = delete.nextLine();

                for (int i = 0; i < Objects.size(); i++) {

                    Objects.remove(item);

                }

            } else if (directions.equals("update")) {
                // function to update
                Scanner update = new Scanner(System.in);
                System.out.println("Enter an Update: ");
                String up = update.nextLine();
                System.out.println("Your information has been updated");
                Objects.add(new String(up));
            } else if (directions.equals("Show")) {
                // function to Show
                for (int i = 0; i < Objects.size(); i++) {

                    System.out.println("Object Entry: " + Objects.get(i));

                }
            }

        }

    }

}
