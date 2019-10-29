
import java.util.ArrayList;

public class Orderlist {

    private ArrayList<Order> olist;
    private int orderNum;

    public Orderlist() {
    }
    
    
    
    public void makeOrder(Menu menu) {
        Order odr = new Order();
        odr.userDialogue(menu);
        olist.add(odr);
    }
    
    public void removeOrder(Order odr) {
        olist.remove(odr);
    }

    @Override
    public String toString() {
        return "Orderlist{" + "olist=" + olist + ", orderNum=" + orderNum + '}';
    }
    
    
}
