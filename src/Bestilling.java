
import java.util.ArrayList;
import java.util.Scanner;

public class Bestilling {

    private ArrayList<Pizza> bestilling = new ArrayList();

    private String kundeNavn;
    private int pizzaNr2;

    public void tilføjPizza(Pizza pizza) {
        bestilling.add(pizza);

    }

    public void fjernPizza(Pizza pizza) {
        bestilling.remove(pizza);
    }
    //Tjek efter?
    public void brugerDialog() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Tryk 1 for at tilføje en bestilling.\nEller 2 for at fjerne bestilling.");
        int svarDialog = myScan.nextInt();
        if (svarDialog == 1) {
            System.out.println("Indtast kundens navn");
            kundeNavn = myScan.nextLine();
            System.out.println("Indtast pizza'ens nummer");
            pizzaNr2 = myScan.nextInt();
            if(pizzaNr==pizzaNr2) {
                tilføjPizza(pizza);
            }
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
