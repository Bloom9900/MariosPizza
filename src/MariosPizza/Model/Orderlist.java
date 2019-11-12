package MariosPizza.Model;

//@Jannich
import MariosPizza.Model.Menu;
import MariosPizza.Model.Pizza;
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

    public Orderlist() {
        this.orderNum = IDFactory.getID();
    }
<<<<<<< HEAD

    public void makeOrder(Menu menu) throws IOException {
=======
//
    public void makeOrder(Menu menu) throws IOException, ClassNotFoundException, SQLException {
>>>>>>> 53bb48597e497185fd9a440e02ec65becc160b74
        Order odr = new Order();
        odr.userDialogue(menu);
        olist.add(odr);
        writeOrderToFile(filename, odr);
    }
// filewriter til programmet
    public void writeToFile(String filename) throws IOException {
        File file = new File(filename);
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(this.toString());
        bw.close();
    }

// file writer til fil 
    public void writeOrderToFile(String filename, Order odr) throws IOException {
        File file = new File(filename);
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(odr.listView());
        bw.close();
    }

    public void getActiveOrdersFrom(String filename) throws FileNotFoundException {
        File fhActj = new File(filename);
        Scanner myScanner = new Scanner(fhActj);
        while (myScanner.hasNextLine()) {
            String line = myScanner.nextLine();
        }
    }

    // order remover, remove order from file
    public void removeOrder(int ordreId) throws IOException {
        Order markedForArchive = null;
        for (Order o : olist) {
            if (o.getOrderID() == ordreId) {
                markedForArchive = o;
            }
        }
        olist.remove(olist.indexOf(markedForArchive));

        File fhArk = new File("Data/AllOrders");
        FileWriter fwArk = new FileWriter(fhArk, true);
        BufferedWriter bwArk = new BufferedWriter(fwArk);
        bwArk.write(markedForArchive.toString());
        bwArk.newLine();
        bwArk.close();
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
            view += order.getOrderID() + ";";
            view += order.getKundeNavn() + ";";
            view += order.getPizzas() + ";";
            view += order.getTotalPris();
            view += "\n";
        }
        return view;
    }

}
