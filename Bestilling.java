/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariopizza;
import java.util.ArrayList;

/**
 *
 * @auth or angry
 */
public class Bestilling {
 
    private ArrayList<Pizza> Bestilling = new ArrayList();
    
    
    
    public void tilføjPizza(Pizza pizza){
        Bestilling.add(pizza);
        
        
    }
    public void fjernPizza(Pizza pizza){
        Bestilling.remove(pizza);
    }

    @Override
    public String toString() {
        String result = "Orderen indeholder:\n";
        for (Pizza pizza: Bestilling){
            if (pizza.getAntal()>1){
                result+=pizza.getAntal()+" Pizzaer nr: "+pizza.getPizzaNr()+"\n";
            }else{
            result+=pizza.getAntal()+" Pizza nr: "+pizza.getPizzaNr()+"\n";
            
        }
        
        }
        return result;
    }
}
    


        
    

