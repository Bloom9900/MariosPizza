
import java.util.ArrayList;
import java.util.Scanner;

public class Bestilling {

    private ArrayList<Pizza> bestilling;
    private String kundeNavn;
    private int pizzaNumber;

    public Bestilling() {
        this.bestilling = new ArrayList<Pizza>();
    }

    //In progress
    public void brugerDialog(ArrayList<Pizza> menu) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Tryk 1 for at tilføje en bestilling.\nEller 2 for at fjerne bestilling.");
        int svarDialog = myScan.nextInt();
        if (svarDialog == 1) {
            System.out.println("Indtast kundens navn");
            myScan.nextLine();
            kundeNavn = myScan.nextLine();
            System.out.println("Indtast pizza'ens nummer");
            pizzaNumber = myScan.nextInt();
            bestilling.add(menu.get(pizzaNumber - 1));
        }
    }
    
    /* Tjek lige hvorfor det fejler?
    @Override
    public String toString() {
        String result = "Orderen indeholder:\n";
        for (Pizza pizza: bestilling){
            if (pizza.getAntal()>1){
                result+=pizza.getAntal()+" Pizzaer nr: "+pizza.getPizzaNr()+"\n";
            }else{
            result+=pizza.getAntal()+" Pizza nr: "+pizza.getPizzaNr()+"\n";
            
        }
        
        }
        return result;
    }
     */
}
