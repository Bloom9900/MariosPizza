package MariosPizza.Model;

import MariosPizza.DataMapper.DBMapper;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainPizzaList {

    ArrayList<Pizza> pizzass;

    public MainPizzaList() throws ClassNotFoundException, SQLException {
        pizzass = new ArrayList<>();
        fillListFromDB();
    }

    public ArrayList<Pizza> getPizzaList() {
        return pizzass;

    }

    public void fillListFromDB() throws ClassNotFoundException, SQLException {
        DBMapper mapper = new DBMapper();
        pizzass = mapper.pizzaList();
    }

    public void filllistFromFile() {
        pizzass = null;
    }
}