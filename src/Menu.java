
import java.util.ArrayList;

public class Menu {

    private ArrayList<Pizza> menu = new ArrayList();

    public void tilføjPizza(Pizza pizza) {
        menu.add(pizza);
    }

    @Override
    public String toString() {
        return "Menuén indeholder: \n" + menu;
    }

}
