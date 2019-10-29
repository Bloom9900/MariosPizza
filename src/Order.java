
import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private String kundeNavn;
    private int antal;
    private int pizzaNr;

    public Order() {
    }

    public void userDialogue(Menu menu) {
        int reply = 0;
        while (reply != 2) {
            Scanner myScan = new Scanner(System.in);
            System.out.println("Press 1 to add order\nPress 2 to exit program.");
            reply = myScan.nextInt();
            myScan.nextLine();
            if (reply == 1) {
                System.out.println("Type costumer name: ");
                kundeNavn = myScan.nextLine();
                System.out.println("Type amount of pizzas: ");
                antal = myScan.nextInt();
                myScan.nextLine();
                for (int i = 0; i < antal; i++) {
                    System.out.println("Type pizzas number");
                    pizzaNr = myScan.nextInt();
                    pizzas.add(menu.menu.get(pizzaNr - 1));
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Order{" + "pizzas=" + pizzas + ", kundeNavn=" + kundeNavn + ", pizzaNumber=" + pizzaNr + ", amountOfPizzas=" + antal + '}';
    }
    
    
}
