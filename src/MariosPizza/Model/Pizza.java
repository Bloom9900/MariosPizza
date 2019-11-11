package MariosPizza.Model;

//@Jannich
public class Pizza {

    private String pizza_name;
    private int pris;
    private int pizza_nr;
    private String topping1;
    private String topping2;
    private String topping3;
    private String topping4;
    private String topping5;
    private String topping6;
    private String topping7;

   /* public Pizza(String pizza_name, int pris, int pizza_nr, String topping1) {
        this.pizza_name = pizza_name;
        this.pris = pris;
        this.pizza_nr = pizza_nr;
        this.topping1 = topping1;
        
    }*/

    public Pizza(String pizza_name, int pris, int pizza_nr, String topping1, String topping2, String topping3, String topping4, String topping5, String topping6, String topping7) {
        this.pizza_name = pizza_name;
        this.pris = pris;
        this.pizza_nr = pizza_nr;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;
        this.topping5 = topping5;
        this.topping6 = topping6;
        this.topping7 = topping7;
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

    public String getTopping1() {
        return topping1;
    }

    public void setTopping(String topping) {
        this.topping1 = topping;
    }

    public String getTopping2() {
        return topping2;
    }

    public void setTopping2(String topping2) {
        this.topping2 = topping2;
    }

    public String getTopping3() {
        return topping3;
    }

    public void setTopping3(String topping3) {
        this.topping3 = topping3;
    }

    public String getTopping4() {
        return topping4;
    }

    public void setTopping4(String topping4) {
        this.topping4 = topping4;
    }

    public String getTopping5() {
        return topping5;
    }

    public void setTopping5(String topping5) {
        this.topping5 = topping5;
    }

    public String getTopping6() {
        return topping6;
    }

    public void setTopping6(String topping6) {
        this.topping6 = topping6;
    }

    public String getTopping7() {
        return topping7;
    }

    public void setTopping7(String topping7) {
        this.topping7 = topping7;
    }

    @Override
    public String toString() {
	    String  msg= "";
	    msg+=pizza_nr + ":";
	    msg+=pizza_name + ":";
	    msg+=topping1 + ":";
	    msg+=pris;
	    return msg;
    }

}
