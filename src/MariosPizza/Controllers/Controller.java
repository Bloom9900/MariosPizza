package MariosPizza.Controllers;

import MariosPizza.Main.Main;
import MariosPizza.Model.*;
import MariosPizza.View.MainMenuUI;
import MariosPizza.View.PizzaUI;
import java.io.IOException;
import java.util.Scanner;
import java.sql.SQLException;
import MariosPizza.DataMapper.DBMapper;

public class Controller {

    public void runProgram(Menu menu) throws IOException, ClassNotFoundException, SQLException {
        int choice = 0;
        int exitValue = 4;
        Scanner myScan = new Scanner(System.in);
        MainPizzaList myList = new MainPizzaList();

        Orderlist orders = new Orderlist();

        while (choice != exitValue) {
            MainMenuUI.showMainMenu();
            choice = myScan.nextInt();
            switch (choice) {
                case 1:
                    PizzaUI pizzaUI = new PizzaUI();
                    pizzaUI.viewPizzaList(myList);
                    break;
                case 2:
                    MainMenuUI.viewSubMenu();
                    int svar = myScan.nextInt();
                    if (svar == 1) {

                        orders.makeOrder(menu);
                        
                        

                        makeOrder(menu);

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



   


    
    public void makeOrder(Menu menu) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Indtast kundenavn: ");
        String kundeNavn = myScan.nextLine();
        System.out.println("Indtast antal pizzaer: ");
        int antal = myScan.nextInt();
        myScan.nextLine();
        for (int i = 0; i < antal; i++) {
            System.out.println("Indtast pizza nummer");
            int pizzaNr = myScan.nextInt();
        }
       // DBAddPizza();
    }

}