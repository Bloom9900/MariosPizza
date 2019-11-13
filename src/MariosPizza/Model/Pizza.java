package MariosPizza.Model;

//@Jannich
public class Pizza {

    private String pizza_name;
    private int pris;
    private int pizza_nr;
    private String topping;

    public Pizza(String pizza_name, int pris, int pizza_nr, String topping) {
        this.pizza_name = pizza_name;
        this.pris = pris;
        this.pizza_nr = pizza_nr;
        this.topping = topping;
        
    }

    public String getNavn() {
        return pizza_name;
    }

    public void setNavn(String navn) {
        this.pizza_name = navn;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getPizzaNr() {
        return pizza_nr;
    }

    public void setPizzaNr(int pizzaNr) {
        this.pizza_nr = pizzaNr;
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
	    msg+=pizza_nr + ":";
	    msg+=pizza_name + ":";
	    msg+=topping + ":";
	    msg+=pris;
	    return msg;
    }

}
