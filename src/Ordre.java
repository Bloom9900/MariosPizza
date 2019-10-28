
import java.util.ArrayList;
import java.util.Scanner;


public class Ordre {

    private ArrayList<Pizza> pizzaer = new ArrayList<>();
    private String kundeNavn;
    private int pizzaNr;
    private int antal;

    public Ordre(String kundeNavn, int pizzaNr, int antal) {
        this.kundeNavn = kundeNavn;
        this.pizzaNr = pizzaNr;
        this.antal = antal;
    }

    public String getKundeNavn() {
        return kundeNavn;
    }

    public void setKundeNavn(String kundeNavn) {
        this.kundeNavn = kundeNavn;
    }

    public int getPizzaNr() {
        return pizzaNr;
    }

    public void setPizzaNr(int pizzaNr) {
        this.pizzaNr = pizzaNr;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }
    
    public void brugerDialog(Menu menu) {
    int svarDialog = 0;
    while (svarDialog != 3) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Tryk 1 for at tilføje en pizza til din ordre\nTryk 3 for at gå tilbage.");
        svarDialog = myScan.nextInt();
        if (svarDialog == 1) {
            System.out.println("Indtast kundens navn");
            myScan.nextLine();
            kundeNavn = myScan.nextLine();
            System.out.println("Indtast pizza'ens nummer");
            pizzaNr = myScan.nextInt();
            pizzaer.add(menu.menu.get(pizzaNr - 1));
            //oversigt.add(bestilling);

            }
            //Fjern pizzaer fra pizzaer arraylist command
            //pizzaer.remove(menu.menu.get(bestillingsNr));
            
        }
    }


}
