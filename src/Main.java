
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();

        String filename = "Data/ActiveOrders";

        Pizza vesuvio = new Pizza("Vesuvio", 57, 1, "tomatsauce, ost, skinke og oregano");
        Pizza amerikaner = new Pizza("Amerikaner", 53, 2, "tomatsauce, ost, oksefars og oregano");
        Pizza cacciatore = new Pizza("Cacciatore", 63, 3, "tomatsauce, ost, pepperoni og oregano");
        Pizza carbona = new Pizza("Carbona", 57, 4, "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano");
        Pizza dennis = new Pizza("Dennis", 65, 5, "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano");
        Pizza bertil = new Pizza("Bertil", 57, 6, "tomatsauce, ost, bacon og oregano");
        Pizza silvia = new Pizza("Silvia", 61, 7, "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano");
        Pizza victoria = new Pizza("Victoria", 61, 8, "tomatsauce, ost, skinke, ananas, champignon, løg og oregano");
        Pizza toronfo = new Pizza("Toronfo", 61, 9, "tomatsauce, ost, skinke, bacon, kebab, chili og oregano");
        Pizza capricciosa = new Pizza("Capricciosa", 61, 10, "tomatsauce, ost, skinke, champignon og oregano");
        Pizza hawai = new Pizza("Hawai", 61, 11, "tomatsauce, ost, skinke, ananas og oregano");
        Pizza leBlissola = new Pizza("Le Blissola", 61, 12, "tomatsauce, ost, skinke, rejer og oregano");
        Pizza venezia = new Pizza("Venezia", 61, 13, "tomatsauce, ost, skinke, bacon og oregano");
        Pizza mafia = new Pizza("Mafia", 61, 14, "tomatsauce, ost, pepperoni, bacon, løg og oregano");

        menu.tilføjPizza(vesuvio);
        menu.tilføjPizza(amerikaner);
        menu.tilføjPizza(cacciatore);
        menu.tilføjPizza(carbona);
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

        Orderlist orders = new Orderlist();

        Scanner myScan = new Scanner(System.in);
        int svar;
        do {
            System.out.println("Tast 1 for at vise menuen.\nTast 2 for at redigere bestillinger.\nTast 3 for at lave statistik.\nTast 4 for at slukke programmet");
            svar = myScan.nextInt();
            switch (svar) {
                case 1:
                    System.out.println(menu);
                    break;
                case 2:
                    System.out.println("Tast 1 for at lave ny ordre\nTast 2 for a slette ordre\nTast 3 for at vise ordre");
                    svar = myScan.nextInt();
                    if (svar == 1) {
                        orders.makeOrder(menu);
                        orders.writeToFile(filename);
                    }
                    if (svar == 2) {
                        System.out.println(orders.toStringView());
                        orders.removeOrder(odr);
                    }
                    if (svar == 3) {
                        System.out.println(orders.toStringView());
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Du skal vælge mellem 1-4");
                    break;
            }
        } while (svar <= 4);
    }

}
