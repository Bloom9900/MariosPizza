package MariosPizza.View;


import MariosPizza.Model.MainPizzaList;
import MariosPizza.Model.Pizza;

public class PizzaUI {

    public void viewPizzaList(MainPizzaList pizzaList) {
        for (Pizza m : pizzaList.getPizzaList()) {
            System.out.println("nr: " + m.getPizzaNr() + " " + m.getNavn() + " " + m.getTopping()+ " " + m.getPris());
        }
    }
}