package MariosPizza.View;

import MariosPizza.Model.Menu;
import MariosPizza.Model.Pizza;

public class MenuUI {
    public static void viewMenu(Menu menuList) {
        String message = "";
        for (Pizza p : menuList.getMovieList()) {
            message += p.getPizzaNr();
            message += p.getNavn();
            message += p.getTopping();
            message += p.getPris();
        }
    }
    
    public static void viewSubMenu() {
        System.out.println("************************************************");
        System.out.println("Muligheder:");
        System.out.println("1. Lav ny ordre");
        System.out.println("2. Slet ordre");
        System.out.println("3. Vis aktuelle ordre");
        System.out.println("************************************************");
    }
}
