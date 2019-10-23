package mariopizza;
public class Pizza {

    private int pris;
    private int pizzaNr;
    private int antal;

    public Pizza(int pris, int pizzaNr, int antal) {
        this.pris = pris;
        this.pizzaNr = pizzaNr;
        this.antal = antal;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
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
        return "Pizza Nr: " + pizzaNr + " koster " + pris + "kr.";
    }

}
