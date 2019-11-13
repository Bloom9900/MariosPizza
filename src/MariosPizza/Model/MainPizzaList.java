/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizza.Model;

import MariosPizza.DataMapper.DBMapper;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author angry
 */
public class MainPizzaList {
    ArrayList<Pizza> pizzass;
  
    
    public MainPizzaList() throws ClassNotFoundException, SQLException{
        pizzass = new ArrayList<>();
        fillListFromDB();
    }
    public ArrayList<Pizza>getPizzaList(){
        return pizzass;
        
    }
    public void fillListFromDB() throws ClassNotFoundException, SQLException{
        DBMapper mapper = new DBMapper();
        pizzass = mapper.pizzaList();
    }
    public void filllistFromFile(){
            pizzass = null;
    } 
}
