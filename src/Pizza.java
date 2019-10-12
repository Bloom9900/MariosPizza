
public class Pizza {

    private int pris;
    private int pizzaNr;

    public Pizza(int pris, int pizzaNr) {
        this.pris = pris;
        this.pizzaNr = pizzaNr;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getPizzaNr() {
        return pizzaNr;
    }

    public void setPizzaNr(int pizzaNr) {
        this.pizzaNr = pizzaNr;
    }

    @Override
    public String toString() {
        return "Pizza Nr: " + pizzaNr + " koster " + pris + "kr.\n";
    }
    
}
