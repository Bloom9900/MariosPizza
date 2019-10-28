
import java.util.ArrayList;

public class Bestilling {

    private ArrayList<Ordre> bestilling;
    private int bestillingsNr;

    public Bestilling() {
        this.bestilling = new ArrayList<Ordre>();
        this.bestillingsNr = IDFactory.getID();
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
