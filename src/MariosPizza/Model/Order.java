package MariosPizza.Model;

//@Jannich
import MariosPizza.DataMapper.DBMapper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;
import MariosPizza.Model.Pizza;
public class Order {

    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private String kundeNavn;
    private int antal;
    private int pizzaNr;
    private int orderID;

    private final Date date = new Date();

    public String getOrderDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(date);
    }

    public Order() {
        this.orderID = IDFactory.getID();
        
        
    }

    public Order(String kundeNavn, int antal, int pizzaNr, int orderID) {
        this.kundeNavn = kundeNavn;
        this.antal = antal;
        this.pizzaNr = pizzaNr;
        this.orderID = orderID;
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
    public int getPris() {
        int Pris = 0;
        for (Pizza pizza : pizzas) {
            Pris = pizza.getPris();
        }
        return Pris;
    }


	@Override
	public String toString() {
		String msg = "";
		msg += this.getOrderID() + ";";
		msg += this.getKundeNavn()+ ";";
		for (Pizza p: pizzas ) {
			msg+= p.toString();
			msg+="@";
                        msg+="Test";
		}
		msg += "]";
		return msg;
	}
    

    public void userDialogue(MainPizzaList pizzass) throws ClassNotFoundException, SQLException {
        DBMapper mapper = new DBMapper();
        Scanner myScan = new Scanner(System.in);
        System.out.println("Indtast kundenavn: ");
        kundeNavn = myScan.nextLine();
        System.out.println("Indtast antal pizzaer: ");
        antal = myScan.nextInt();
        myScan.nextLine();
        for (int i = 0; i < antal; i++) {
            System.out.println("Indtast pizza nummer");
            pizzaNr = mapper.DBAddStat();
            pizzas.add(pizzass.pizzass.get(pizzaNr -  1));
            mapper.DBAddPizza(this);
            mapper.DBAddOmst();
            
        }
    }
    

    public String listView() {
        String message = "";
        message += "\n" + "Order nr: " + this.orderID + ":" + "\n" + "Kunde: " + this.kundeNavn + "\n";
        for (Pizza pizza : this.pizzas) {
            message += pizza.getNavn() + ";";
            message += "\n";
        }

        return message + "\n" + "\n";
    }

   

    
    }
            
            
        
    

