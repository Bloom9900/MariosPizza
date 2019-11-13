package MariosPizza.Main;

//@Artem
import MariosPizza.Controllers.Controller;
import MariosPizza.DataMapper.DBMapper;
import MariosPizza.Model.MainPizzaList;
import MariosPizza.Model.Orderlist;
import MariosPizza.Model.Pizza;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

        MainPizzaList pizzass = new MainPizzaList();

        String filename = "Data/ActiveOrders";

        Controller ctr = new Controller();

        ctr.runProgram(pizzass);

    }

}
