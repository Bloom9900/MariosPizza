/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariopizza;

/**
 *
 * @author angry
 */
public class BestillingOversigt {
    
    public static void main(String[] args){
       Bestilling bestilling = new Bestilling();
      
       
       Pizza vesuvio = new Pizza(57,1,2);
       Pizza amerikaner = new Pizza(53,2,1);
       
       bestilling.tilføjPizza(vesuvio);
       bestilling.tilføjPizza(amerikaner);
       
       
        System.out.println(bestilling);
       
        
        
        
        
        
    }
    
}
