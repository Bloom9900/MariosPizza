
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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

    public void removeOrder(Order odr) {
        olist.remove(odr);
    }

    public void viewOrders(Order odr) {
        System.out.println(olist);
    }

    @Override
    public String toString() {
        String message = "";
        for (Order order : olist) {
            for (Pizza pizza : order.getPizzas()) {
                message += order.getOrderID() + ";";
                message += pizza.getNavn() + ";";
                message += "\n";
            }
        }
        return message;
    }

}
