package mariopizza;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        
        Pizza vesuvio = new Pizza(57, 1,0);
        Pizza amerikaner = new Pizza(53, 2,0);
        Pizza cacciatore = new Pizza(63, 4,0);
        Pizza dennis = new Pizza(65, 5,0);
        Pizza bertil = new Pizza(57, 6,0);
        Pizza silvia = new Pizza(61, 7,0);
        Pizza victoria = new Pizza(61, 8,0);
        Pizza toronfo = new Pizza(61, 9,0);
        Pizza capricciosa = new Pizza(61, 10,0);
        Pizza hawai = new Pizza(61, 11,0);
        Pizza leBlissola = new Pizza(61, 12,0);
        Pizza venezia = new Pizza(61, 13,0);
        Pizza mafia = new Pizza(61, 14,0);

        menu.tilføjPizza(vesuvio);
        menu.tilføjPizza(amerikaner);
        menu.tilføjPizza(cacciatore);
        menu.tilføjPizza(dennis);
        menu.tilføjPizza(bertil);
        menu.tilføjPizza(silvia);
        menu.tilføjPizza(victoria);
        menu.tilføjPizza(toronfo);
        menu.tilføjPizza(capricciosa);
        menu.tilføjPizza(hawai);
        menu.tilføjPizza(leBlissola);
        menu.tilføjPizza(venezia);
        menu.tilføjPizza(mafia);

        System.out.println(menu);
    }
}
