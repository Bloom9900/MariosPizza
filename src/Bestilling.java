
import java.util.ArrayList;
import java.util.Scanner;

public class Bestilling {

    private ArrayList<Pizza> bestilling;
    private String kundeNavn;
    private int pizzaNumber;
    private int bestillingsNr;

    public Bestilling() {

        this.bestilling = new ArrayList<Pizza>();
        this.bestillingsNr = IDFactory.getID();
    }

    public void brugerDialog(Menu menu) {
        int svarDialog = 0;
        while (svarDialog != 3) {
            Scanner myScan = new Scanner(System.in);
            System.out.println("Tryk 1 for at tilføje en bestilling.\nTyk 2 for at fjerne bestilling.\nTryk 3 for at gå tilbage.");
            svarDialog = myScan.nextInt();
            if (svarDialog == 1) {
                System.out.println("Indtast kundens navn");
                myScan.nextLine();
                kundeNavn = myScan.nextLine();
                System.out.println("Indtast pizza'ens nummer");
                pizzaNumber = myScan.nextInt();
                bestilling.add(menu.menu.get(pizzaNumber - 1));
                //oversigt.add(bestilling);

            }
            if (svarDialog == 2) {
                bestilling.remove(menu.menu.get(bestillingsNr));
            }
        }

    }

    @Override
    public String toString() {
        String message = "";
        int bestillingsNr = 0;
        for (Pizza pizza : bestilling) {
            bestillingsNr++;
            message += "Bestillings nummer: " + bestillingsNr;
            message += "\nPizza: " + pizza.getPizzaNr() + "." + pizza.getNavn() + ": " + pizza.getTopping() + " - " + pizza.getPris() + ",-\n";
            message += " Til - " + kundeNavn + "\n";
        }
        return message;
    }
}
