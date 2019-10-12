
public class Main {
    
    public static void main(String[] args) {
        Pizza vesuvio = new Pizza(57,1);
        Pizza amerikaner = new Pizza(53,2);
        Pizza cacciatore = new Pizza(63,4);
        Pizza dennis = new Pizza(65,5);
        Pizza bertil = new Pizza(57,6);
        Pizza silvia = new Pizza (61,7);
        Pizza victoria = new Pizza (61,8);
        Pizza toronfo = new Pizza (61,9);
        Pizza capricciosa = new Pizza (61,10);
        Pizza hawai = new Pizza (61,11);
        Pizza leBlissola = new Pizza (61,12);
        Pizza venezia = new Pizza (61,13);
        Pizza mafia = new Pizza (61,14);
        
        Menu menu = new Menu();
        
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
    }
}
