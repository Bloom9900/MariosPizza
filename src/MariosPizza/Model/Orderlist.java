package MariosPizza.Model;

//@Jannich
import MariosPizza.Model.*;
import MariosPizza.Controllers.Controller;
import MariosPizza.DataMapper.DBMapper;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Orderlist {

    private final static String filename = "Data/ActiveOrders";
    private ArrayList<Order> olist = new ArrayList<>();
    private int orderNum;

    Controller ct = new Controller();

    public Orderlist() {
        this.orderNum = IDFactory.getID();
    }

    //ryk til controller klasse
    public void makeOrder(MainPizzaList pizzass) throws IOException, ClassNotFoundException, SQLException {
        Order odr = new Order();
        odr.userDialogue(pizzass);
        olist.add(odr);
        //writeOrderToFile(filename, ct);
    }

    // order remover, remove order from file / ryk til controller klasse
    public void removeOrder(int ordreId) throws IOException {
        Order markedForArchive = null;
        for (Order o : olist) {
            if (o.getOrderID() == ordreId) {
                markedForArchive = o;
            }
        }
        olist.remove(olist.indexOf(markedForArchive));
    }

    public void viewOrders(Order odr) {
        System.out.println(olist);
    }

    @Override
    public String toString() {
        String message = "";
        for (Order order : olist) {
            message += "\n" + "Order nr: " + order.getOrderID() + ":" + "\n" + "Kunde: " + order.getKundeNavn() + "\n";
            for (Pizza pizza : order.getPizzas()) {
                message += pizza.getNavn() + ";";
                message += "\n";
            }
        }
        return message + "\n" + "________________" + "\n";
    }

    public String toStringView() {
        String view = "";
        for (Order order : olist) {
            view += "Bestillingstidspunkt ";
            view += order.getOrderDate() + " - ID: ";
            view += order.getOrderID() + ". ";
            view += order.getKundeNavn() + " ";
            view += order.getPizzas() + " Totalpris: ";
            view += order.getTotalPris();
            view += "\n";
        }
        return view;
    }

}
