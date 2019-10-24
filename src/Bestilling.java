
import java.util.ArrayList;
import java.util.Scanner;

public class Bestilling {

    private ArrayList<Pizza> bestilling;
    private String kundeNavn;
    private int pizzaNumber;

    public Bestilling(ArrayList<Pizza> bestilling, String kundeNavn) {
        this.bestilling = bestilling;
        this.kundeNavn = kundeNavn;
        bestilling = new ArrayList<>();
    }

    public void brugerDialog() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Tryk 1 for at tilføje en bestilling.\nEller 2 for at fjerne bestilling.");
        int svarDialog = myScan.nextInt();
        if (svarDialog == 1) {
            System.out.println("Indtast kundens navn");
            kundeNavn = myScan.nextLine();
            System.out.println("Indtast pizza'ens nummer");   
            pizzaNumber = myScan.nextInt();
            bestilling.add(Menu.getMenu(get(pizzaNumber-1)));
        }
        if (svarDialog == 2) {
            bestilling.remove(bestilling.get(pizzaNumber-1));
        }
    }
    
    /*
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
