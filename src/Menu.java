
import java.util.ArrayList;

public class Menu {

    private ArrayList<Pizza> menu = new ArrayList();

    public void tilføjPizza(Pizza pizza) {
        menu.add(pizza);
    }

    @Override
    public String toString() {
        String result = "Menuén indeholder:\n";
        for (Pizza pizza : menu) {
            result += pizza.toString() + "\n";            
        }
        return result;
    }

}
