/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizza.View;

import MariosPizza.Model.MainPizzaList;
import MariosPizza.Model.Pizza;

/**
 *
 * @author angry
 */
public class PizzaUI {
    public static void viewPizzaList(MainPizzaList pizzaList) { 
		for (Pizza m : pizzaList.getPizzaList()) {
			System.out.println("nr: "+ m.getPizzaNr()+" " + m.getNavn() +" "+ m.getTopping1()+" "+ m.getTopping2()+" "+ m.getTopping3()+" "+ m.getTopping4()+" "+ m.getTopping5()+" "+ m.getTopping6()+" "+ m.getTopping7()+" "+ m.getPris());
		}
}
}
