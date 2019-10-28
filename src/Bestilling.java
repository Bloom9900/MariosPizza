
import java.util.ArrayList;
import java.util.Scanner;

public class Bestilling {
    private ArrayList<ArrayList<Pizza>> Oversigt;
    private ArrayList<Pizza> bestilling;
    private String kundeNavn;
    private int pizzaNumber;
    private int bestillingsNr;

    public Bestilling() {
              
        this.bestilling = new ArrayList<Pizza>();
        this.bestillingsNr = IDFactory.getID();
    }

    /**
     *
     * @param Oversigt
     */
    public Bestilling(ArrayList<ArrayList<Pizza>> Oversigt) {
        this.Oversigt = Oversigt;
    }

    //In progress
    public void brugerDialog(Menu menu) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Tryk 1 for at tilføje en bestilling.\nTyk 2 for at fjerne bestilling.\nTryk 3 for at vise aktuelle bestillinger");
        int svarDialog = myScan.nextInt();
        if (svarDialog == 1) {
            System.out.println("Indtast kundens navn");
            myScan.nextLine();
            kundeNavn = myScan.nextLine();
            System.out.println("Indtast pizza'ens nummer");
            pizzaNumber = myScan.nextInt();
            bestilling.add(menu.menu.get(pizzaNumber - 1));
            Oversigt.add(bestilling);
            
        }
        if (svarDialog == 2) {
            bestilling.remove(menu.menu.get(bestillingsNr));
        }
    }

    @Override
    public String toString() {
        int bestillingsNr = 0;
        for (Pizza pizza : bestilling) {
            bestillingsNr++;
        }
        return "Bestillinger: \nBestillings nummer: " + bestillingsNr + "\n" + bestilling + " Til - " + kundeNavn+"\n";
    }
}
