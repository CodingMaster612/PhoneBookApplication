package PhoneBook;

public class Practice {
    public static void main(String[] args) {

        System.out.println("Welcome to Sallys Lemonade Stand!!! Buy somthin!");

        Scanner scr = new Scanner(System.in);

        Product lemonade = new Product(8.00, "Sunshine Lemonade", "So good make you wanna slap yo mamma!");
        Product sallysPop = new Product();

        sallysPop.setPrice(5.50);

        System.out.println(sallysPop.getPrice());

        System.out.print("What is the price for the pop");
        Double price = scr.nextDouble();
        scr.nextLine();
        System.out.print("What is the name for the pop");
        String name = scr.nextLine();
        System.out.print("What is the description for the pop");
        String descrip = scr.nextLine();
        sallysPop.setName(name);
        sallysPop.setPrice(price);
        sallysPop.setDescription(descrip);

        System.out.println(lemonade.toString());
        System.out.println(sallysPop.toString());

    }

}
