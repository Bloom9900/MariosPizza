package MariosPizza.Main;

//@Artem
import MariosPizza.Controllers.Controller;
import MariosPizza.Model.MainPizzaList;
import java.io.IOException;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

        MainPizzaList pizzass = new MainPizzaList();
        Controller ctr = new Controller();

        ctr.runProgram(pizzass);

    }

}
