
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Orderlist {

    private ArrayList<Order> olist = new ArrayList<>();
    private int orderNum;

    public Orderlist() {
        this.orderNum = IDFactory.getID();
    }

    public void makeOrder(Menu menu) {
        Order odr = new Order();
        odr.userDialogue(menu);
        olist.add(odr);
    }

    public void writeToFile(String filename) throws IOException {
        File file = new File(filename);
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(this.toString());
        bw.close();
    }

    public void getActiveOrdersFrom(String filename) throws FileNotFoundException{
        File fhActj = new File(filename);
	Scanner myScanner = new Scanner(fhActj);
	while (myScanner.hasNextLine()) {
		String line = myScanner.nextLine();
	}
    }

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
            message +="\n"+ "Order nr: "+ order.getOrderID() +":"+"\n" + "Kunde: "+ order.getKundeNavn()+"\n";
            for (Pizza pizza : order.getPizzas()) {
                //message += order.getOrderID() + ";";
                message += pizza.getNavn() + ";";
                message += "\n";
            }
        }
        return message + "\n"+"________________"+"\n";
    }
    
    public String toStringView() {
        String view = "";
        for (Order order : olist) {
            view += order.getOrderID() + ";";
            view += order.getKundeNavn()+ ";";
            view += order.getPizzas() + ";";
            view += order.getTotalPris();
            view += "\n";
        }
        return view;
    }

}
