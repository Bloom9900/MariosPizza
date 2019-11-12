package MariosPizza.Model;

//@Jannich
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.sql.*;

public class Order {

    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private String kundeNavn;
    private int antal;
    private int pizzaNr;
    private int orderID;
    private final Date creationDate = new Date();

    public Date getOrderDate() {
        return creationDate;
    }

    public Order() {
        this.orderID = IDFactory.getID();
    }

    public Order(int orderID, String kundeNavn, int antal) {
    }

    public int getOrderID() {
        return orderID;
    }

    public String getKundeNavn() {
        return kundeNavn;
    }

    public void setKundeNavn(String kundeNavn) {
        this.kundeNavn = kundeNavn;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public int getPizzaNr() {
        return pizzaNr;
    }

    public void setPizzaNr(int pizzaNr) {
        this.pizzaNr = pizzaNr;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public int getTotalPris() {
        int totalPris = 0;
        for (Pizza pizza : pizzas) {
            totalPris += pizza.getPris();
        }
        return totalPris;
    }

    public String listView() {
        String message = "";
        message += "\n" + "Order nr: " + this.orderID + ":" + "\n" + "Kunde: " + this.kundeNavn + "\n";
        for (Pizza pizza : this.pizzas) {
            message += pizza.getNavn() + ";";
            message += "\n";
        }

        return message + "\n" + "\n";
    }

    //ryk ind i Mapper klassen
    public void DBAddPizza() {
        try {
            String Customer_name = this.kundeNavn;
            int Order_ID = this.orderID;
            int Pizza = this.pizzaNr;

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MariosPizza?", "root", "password");
            PreparedStatement pst = con.prepareStatement("insert into ordre(Order_ID,Customer_name,Pizza) values(?,?,?)");

            pst.setInt(1, Order_ID);
            pst.setString(2, Customer_name);
            pst.setInt(3, Pizza);
            //pst.setInt(4, Pris);

            int i = pst.executeUpdate();
            if (i != 0) {
                System.out.println("added");
            } else {
                System.out.println("failed to add");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
