
import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private String costumerName;
    private int pizzaNumber;
    private int amountOfPizzas;

    public Order() {
    }

    public void userDialogue(Menu menu) {
        int reply = 0;
        while (reply != 2) {
            Scanner myScan = new Scanner(System.in);
            System.out.println("Press 1 to add order\nPress 2 to exit program.");
            reply = myScan.nextInt();
            if (reply == 1) {
                System.out.println("Type costumer name");
                costumerName = myScan.nextLine();
                System.out.println("Type amount of pizzas");
                amountOfPizzas = myScan.nextInt();
                for (int i = 0; i < amountOfPizzas; i++) {
                    System.out.println("Type pizzas number");
                    pizzas.add(menu.menu.get(pizzaNumber - 1));
                }
            }
        }
    }
}
