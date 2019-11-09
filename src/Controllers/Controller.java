package Controllers;

import MariosPizza.Main.Main;
import MariosPizza.Model.*;
import MariosPizza.View.MainMenuUI;
import MariosPizza.View.MenuUI;
import java.io.IOException;
import java.util.Scanner;

public class Controller {

    public static void runProgram(Menu menu) throws IOException {
        int choice = 0;
        int exitValue = 0;
        Scanner myScan = new Scanner(System.in);

        Orderlist orders = new Orderlist();

        while (choice != exitValue) {
            MainMenuUI.showMainMenu();
            choice = myScan.nextInt();
            switch (choice) {
                case 1:
                    MainMenuUI.showMainMenu();
                    break;
                case 2:
                    MenuUI.viewSubMenu();
                    int svar = myScan.nextInt();
                    if (svar == 1) {
                        orders.makeOrder(menu);
                    }
                    if (svar == 2) {
                        System.out.println(orders.toStringView());
                        System.out.println("Tast nr på ordre der skal slettes (overføres til arkiv)");
                        int id = myScan.nextInt();
                        orders.removeOrder(id);
                    }
                    if (svar == 3) {
                        System.out.println(orders.toStringView());
                    }
                    break;
                case 3:
                    //To be made
                    break;
                default:
                    System.out.println("Exit");
                    choice = exitValue;

            }
        }
    }
}
