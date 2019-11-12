/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizza.Model;

import MariosPizza.Util.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import MariosPizza.Model.Pizza;
import java.util.Scanner;
/**
 *
 * @author angry
 */
public class orderMaker {
    Connection myConnector = null;
        Statement statement = null;
        ResultSet resultSet = null;
        Scanner myScan = new Scanner(System.in);
        int pizzaNr = 
    myConnector = DBConnector.getConnector();
        String query = "SELECT * FROM pizzamenu where pizza_id = ";
        statement = myConnector.createStatement();
        resultSet = statement.executeQuery(query);
        
        while (resultSet.next()){
    
}
