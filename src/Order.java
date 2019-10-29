
import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private String kundeNavn;
    private int antal;
    private int pizzaNr;
    private int orderID;

    public Order() {
        this.orderID = IDFactory.getID();
    }

    public int getOrderID() {
        return orderID;
    }
    
    

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }
    
    
    

    public void userDialogue(Menu menu) {
        Scanner myScan = new Scanner(System.in);
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
