package MariosPizza.Model;

//@Jannich
import MariosPizza.Model.IDFactory;
import MariosPizza.Model.Menu;
import MariosPizza.Model.Pizza;
import java.time.LocalTime;
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
    
    public Order(int orderID, String kundeNavn, int antal) {
    }

    public int getOrderID() {
        return orderID;
    }

    public String getKundeNavn() {
        return kundeNavn;
    }

    public void setKundeNavn(String kundeNavn) {
        this.kundeNavn = kundeNavn;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public int getPizzaNr() {
        return pizzaNr;
    }

    public void setPizzaNr(int pizzaNr) {
        this.pizzaNr = pizzaNr;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }
    
    public int getTotalPris() {
        int totalPris = 0;
        for (Pizza pizza : pizzas) {
            totalPris += pizza.getPris();
        }
        return totalPris;
    }

	@Override
	public String toString() {
		LocalTime timestamp = LocalTime.now();
		String msg = "";
		msg += this.getOrderID() + ";";
		msg += this.getKundeNavn()+ ";";
		msg += timestamp + ";[";
		for (Pizza p: pizzas ) {
			msg+= p.toString();
			msg+="@";
		}
		msg += "]";
		return msg;
	}
    

    public void userDialogue(Menu menu) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Indtast kundenavn: ");
        kundeNavn = myScan.nextLine();
        System.out.println("Indtast antal pizzaer: ");
        antal = myScan.nextInt();
        myScan.nextLine();
        for (int i = 0; i < antal; i++) {
            System.out.println("Indtast pizza nummer");
            pizzaNr = myScan.nextInt();
            pizzas.add(menu.menu.get(pizzaNr - 1));
        }
    }
    
    public String listView() {
        String message = "";
            message +="\n"+ "Order nr: "+ this.orderID +":"+"\n" + "Kunde: "+ this.kundeNavn+"\n";
            for (Pizza pizza : this.pizzas) {
                message += pizza.getNavn() + ";";
                message += "\n";
            }
        
        return message + "\n"+"\n";
    }
}
