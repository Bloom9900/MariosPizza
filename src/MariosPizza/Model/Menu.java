package MariosPizza.Model;

//@Artem
import MariosPizza.Model.Pizza;
import java.util.ArrayList;

public class Menu {

    public ArrayList<Pizza> menu = new ArrayList();
    
    public ArrayList<Pizza> getMovieList() {
        return menu;
    }

    public void tilføjPizza(Pizza pizza) {
        menu.add(pizza);
    }

    public void fjernPizza(Pizza pizza) {
        menu.remove(pizza);
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
