package PhoneBook;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        String directions;

        List<String> Objects = new ArrayList<>();

        List<String> address = new ArrayList<>();

        List<String> person = new ArrayList<>();

        while (true) {
            Scanner console = new Scanner(System.in);
            System.out.println(
                    " ██▓███   ██░ ██  ▒█████   ███▄    █ ▓█████  ▄▄▄▄    ▒█████   ▒█████   ██ ▄█▀ ███▄ ▄███▓▓█████  ███▄    █  █    ██");
            System.out.println(
                    "▓██░  ██▒▓██░ ██▒▒██▒  ██▒ ██ ▀█   █ ▓█   ▀ ▓█████▄ ▒██▒  ██▒▒██▒  ██▒ ██▄█▒ ▓██▒▀█▀ ██▒▓█   ▀  ██ ▀█   █  ██  ▓██▒");
            System.out.println(
                    "▓██░ ██▓▒▒██▀▀██░▒██░  ██▒▓██  ▀█ ██▒▒███   ▒██▒ ▄██▒██░  ██▒▒██░  ██▒▓███▄░ ▓██    ▓██░▒███   ▓██  ▀█ ██▒▓██  ▒██░");
            System.out.println(
                    "▒██▄█▓▒ ▒░▓█ ░██ ▒██   ██░▓██▒  ▐▌██▒▒▓█  ▄ ▒██░█▀  ▒██   ██░▒██   ██░▓██ █▄ ▒██    ▒██ ▒▓█  ▄ ▓██▒  ▐▌██▒▓▓█  ░██░");
            System.out.println(
                    "▒██▒ ░  ░░▓█▒░██▓░ ████▓▒░▒██░   ▓██░░▒████▒░▓█  ▀█▓░ ████▓▒░░ ████▓▒░▒██▒ █▄▒██▒   ░██▒░▒████▒▒██░   ▓██░▒▒█████▓ ");
            System.out.println(
                    "▒▓▒░ ░  ░ ▒ ░░▒░▒░ ▒░▒░▒░ ░ ▒░   ▒ ▒ ░░ ▒░ ░░▒▓███▀▒░ ▒░▒░▒░ ░ ▒░▒░▒░ ▒ ▒▒ ▓▒░ ▒░   ░  ░░░ ▒░ ░░ ▒░   ▒ ▒ ░▒▓▒ ▒ ▒ ");
            System.out.println(
                    "░▒ ░      ▒ ░▒░ ░  ░ ▒ ▒░ ░ ░░   ░ ▒░ ░ ░  ░▒░▒   ░   ░ ▒ ▒░   ░ ▒ ▒░ ░ ░▒ ▒░░  ░      ░ ░ ░  ░░ ░░   ░ ▒░░░▒░ ░ ░ ");

            System.out.println("Please enter your selection: (q to Quit): ");
            System.out.println("---------------------------------------------");
            System.out.println("ADD-ENTRIES: Type Add");
            System.out.println("---------------------------------------------");
            System.out.println("ADD-ENTRIES: Type Add-Address");
            System.out.println("---------------------------------------------");
            System.out.println("DELETE-ENTRIES: Type delete");
            System.out.println("---------------------------------------------");
            System.out.println("DELETE-ENTRIES: Type deleted-address");
            System.out.println("---------------------------------------------");
            System.out.println("DELETE-ENTRIES: Type deleted-Person");
            System.out.println("---------------------------------------------");
            System.out.println("UPDATE=ENTRIES: Type update ");
            System.out.println("---------------------------------------------");
            System.out.println("UPDATE=ENTRIES: Type Add-By-Index-Address ");
            System.out.println("---------------------------------------------");
            System.out.println("UPDATE=ENTRIES: Type Add-By-Index-Main ");
            System.out.println("---------------------------------------------");
            System.out.println("UPDATE=ENTRIES: Type Add-Person");
            System.out.println("---------------------------------------------");
            System.out.println("CALL-ENTRIES: Type Call-Info ");
            System.out.println("---------------------------------------------");
            System.out.println("Valid-ENTRIES: Type Valid ");
            System.out.println("---------------------------------------------");
            System.out.println("SHOW-IN-ORDER: Type Show ");
            System.out.println("---------------------------------------------");

            directions = console.nextLine();

            if (directions.equals("q")) {
                System.out.println("Program Terminated");
                break;
            }

            else if (directions.equals("Add")) {

                Scanner con = new Scanner(System.in);

                System.out.println(" .--.    .-.   .-.       .-..-.");
                System.out.println(": .; :   : :   : :       : `' :");
                System.out.println(":    : .-' : .-' : _____ : .. : .--. ,-.,-..-..-.");
                System.out.println(": :: :' .; :' .; ::_____:: :; :' '_.': ,. :: :; :");
                System.out.println(":_;:_;`.__.'`.__.'       :_;:_;`.__.':_;:_;`.__.'");

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

            } else if (directions.equals("Add-Address")) {
                Address add = new Address();

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter A zip code: ");
                String zipCode = scanner.nextLine();

                address.add(zipCode);
                add.setAddress(zipCode);

                System.out.println("Enter State: ");
                String state = scanner.nextLine();

                address.add(state);
                add.setAddress(state);

                // address.add(0, items);
                // add teh ability to add things to a certain index

                System.out.println(address.toString());

            }

            else if (directions.equals("delete")) {
                Scanner delete = new Scanner(System.in);
                System.out.println("Choose what element to delete");
                String item = delete.nextLine();

                for (int i = 0; i < Objects.size(); i++) {

                    Objects.remove(item);

                }

            } else if (directions.equals("deleted-address")) {
                Scanner x = new Scanner(System.in);
                System.out.println("Choose what element to delete");
                String items = x.nextLine();

                for (int i = 0; i < address.size(); i++) {

                    address.remove(items);

                }
                System.out.println("New list: " + address.toString());
            }

            else if (directions.equals("deleted-Person")) {
                Scanner p = new Scanner(System.in);
                System.out.println("Choose what item to delete");
                String pero = p.nextLine();

                for (int r = 0; r < person.size(); r++) {
                    person.remove(pero);
                }
                System.out.println("New list: " + person.toString());
            }

            else if (directions.equals("update")) {
                // function to update
                Scanner update = new Scanner(System.in);
                System.out.println("Enter an Update: ");
                String up = update.nextLine();
                System.out.println("Your information has been updated");
                Objects.add(new String(up));
            } else if (directions.equals("Add-By-Index-Address")) {
                Scanner X = new Scanner(System.in);
                System.out.println("Enter Index: ");
                String index = X.nextLine();

                if (index.equals("Zero")) {
                    System.out.println("Enter to add info to index 0: ");
                    index = X.nextLine();
                    address.add(0, index);
                }
                if (index.equals("One")) {
                    System.out.println("Enter to add info to index 1: ");
                    index = X.nextLine();
                    address.add(1, index);
                }

                if (index.equals("Two")) {
                    System.out.println("Enter to add info to index 2: ");
                    index = X.nextLine();
                    address.add(2, index);
                }
                if (index.equals("Three")) {
                    System.out.println("Enter to add info to index 3 ");
                    index = X.nextLine();
                    address.add(3, index);
                }
                if (index.equals("Four")) {
                    System.out.println("Enter to add info to index 4: ");
                    index = X.nextLine();
                    address.add(4, index);
                }
                if (index.equals("Five")) {
                    System.out.println("Enter to add info to index 5: ");
                    index = X.nextLine();
                    address.add(5, index);
                }
                if (index.equals("Six")) {
                    System.out.println("Enter to add info to index 5: ");
                    index = X.nextLine();
                    address.add(6, index);
                }

            } else if (directions.equals("Add-By-Index-Main")) {
                Scanner y = new Scanner(System.in);
                System.out.println("Enter Index: ");
                String indexed = y.nextLine();

                switch (indexed) {
                    case "Zero":
                        System.out.println("Enter to add info to index 0");
                        indexed = y.nextLine();
                        Objects.add(0, indexed);
                        break;
                    case "One":
                        System.out.println("Enter to add info to index 1");
                        indexed = y.nextLine();
                        Objects.add(1, indexed);
                        break;
                    case "Two":
                        System.out.println("Enter to add info to index 2");
                        indexed = y.nextLine();
                        Objects.add(2, indexed);
                        break;
                    case "Three":
                        System.out.println("Enter to add info to index 3");
                        indexed = y.nextLine();
                        Objects.add(3, indexed);
                        break;
                    case "Four":
                        System.out.println("Enter to add info to index 4");
                        indexed = y.nextLine();
                        Objects.add(4, indexed);
                        break;
                    case "Five":
                        System.out.println("Enter to add info to index 5");
                        indexed = y.nextLine();
                        Objects.add(5, indexed);
                        break;
                    case "Six":
                        System.out.println("Enter to add info to index 6");
                        indexed = y.nextLine();
                        Objects.add(6, indexed);
                        break;

                    default:
                        System.out.println("Invalid Character! ");
                }

            } else if (directions.equals("Add-Person")) {
                Person persons = new Person();

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter A First Name ");
                String firstPerson = scanner.nextLine();
                person.add(firstPerson);
                persons.setFirstName(firstPerson);

                System.out.println("Enter Last Name: ");
                String lastPerson = scanner.nextLine();
                person.add(lastPerson);
                persons.setLastName(lastPerson);

                System.out.println(person.toString());
            }

            else if (directions.equals("Call-Info")) {
                Scanner scanner = new Scanner(System.in);
                // Address callAddress = new Address();
                // Person callPerson = new Person();
                AddressClass callAddress = new AddressClass();

                System.out.println("-----------------------");
                System.out.println("Type Call-Address: ");
                System.out.println("-----------------------");
                String callAdd = scanner.nextLine();

                for (int i = 0; i < address.size(); i++) {
                    if (callAdd.equals(address.get(i))) {
                        System.out.println(Objects);
                        System.out.println(person);
                        callAddress.info = "Your Program has been updated!";
                        callAddress.getAddress();

                    }

                }
                System.out.println("-----------------------");
                System.out.println("Type Call-Person: ");
                System.out.println("-----------------------");
                String call = scanner.nextLine();
                for (int j = 0; j < person.size(); j++) {
                    if (call.equals(person.get(j))) {
                        System.out.println(Objects);
                        System.out.println(address);

                    }

                }
                System.out.println("-----------------------");
                System.out.println("Type Call-Main: ");
                System.out.println("-----------------------");
                String callMain = scanner.nextLine();
                for (int k = 0; k < Objects.size(); k++) {
                    if (callMain.equals(Objects.get(k))) {
                        System.out.println(person);
                        System.out.println(address);
                    }

                }

            } else if (directions.equals("Valid")) {
                do {

                    Scanner valid = new Scanner(System.in);
                    System.out.println("Enter the Whole address to see if the entry is valid: ");
                    String str = valid.nextLine();

                    if (Objects.contains(str) || address.contains(str) || person.contains(str)) {
                        System.out.println("Valid Answer");

                    }

                    else if (str.equals("q")) {
                        break;
                    }

                    else {
                        System.out.println("Not Valid");
                    }

                } while (!directions.equals("q"));

            }

            else if (directions.equals("Show")) {
                // function to Show
                for (int i = 0; i < Objects.size(); i++) {

                    System.out.println("Object Entry for Main List: " + Objects.get(i));

                }
                for (int j = 0; j < address.size(); j++) {

                    System.out.println("Object Entry For Address: " + address.get(j));

                }
                for (int k = 0; k < person.size(); k++) {
                    System.out.println("Object Entry for Person " + person.get(k));
                }
            }

        }

    }

}
