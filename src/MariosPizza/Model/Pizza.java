package MariosPizza.Model;

//@Jannich
public class Pizza {

    private String navn;
    private int pris;
    private int pizzaNr;
    private String topping;

    public Pizza(String navn, int pris, int pizzaNr, String topping) {
        this.navn = navn;
        this.pris = pris;
        this.pizzaNr = pizzaNr;
        this.topping = topping;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
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

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
	    String  msg= "";
	    msg+=pizzaNr + ":";
	    msg+=navn + ":";
	    msg+=topping + ":";
	    msg+=pris;
	    return msg;
    }

}
