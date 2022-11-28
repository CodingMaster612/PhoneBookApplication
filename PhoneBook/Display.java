package PhoneBook;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        String directions;

        List<String> Objects = new ArrayList<>();

        List<Integer> fixedList = Arrays.asList(new Integer[5]);

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

            }

            else if (directions.equals("Search")) {

                Scanner search = new Scanner(System.in);
                System.out.println("Choose what element to Search Type Search-Start: ");
                String str = search.nextLine();

                for (int i = 0; i < Objects.size(); i++) {
                    if (str.equals("Search-Start")) {

                        System.out.println("Enter to choose the desired information: ");
                        System.out.println("????????????????????????????????????????????");
                        System.out.println(": Type Search First-Name");
                        System.out.println("---------------------------------------------");
                        System.out.println(": Type Search Last-name");
                        System.out.println("---------------------------------------------");
                        System.out.println(": Type Search City");
                        System.out.println("---------------------------------------------");
                        System.out.println(": Type Search State ");
                        System.out.println("---------------------------------------------");
                        System.out.println(": Type Search Zip ");
                        System.out.println("---------------------------------------------");
                        System.out.println(": Type Search PhoneNumber");
                        System.out.println("???????????????????????????????????????????");
                        str = search.nextLine();
                    }
                    switch (str) {
                        case "First-Name":
                            System.out.println("Element Info : " + Objects.get(i));
                            break;
                        case "Last-Name":
                            System.out.println("Element Info : " + Objects.get(i));
                            break;
                        case "City":
                            System.out.println("Element Info : " + Objects.get(i));
                            break;
                        case "State":
                            System.out.println("Element Info : " + Objects.get(i));
                            break;

                        case "Zip":
                            System.out.println("Element Info : " + Objects.get(i));
                            break;

                        case "PhoneNumber":
                            System.out.println("Element Info : " + Objects.get(i));
                            break;

                        default:
                            for (int j = 0; j < Objects.size(); j++) {
                                System.out.println(Objects.get(i) + "Invalid Key word ");
                            }

                    }

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
