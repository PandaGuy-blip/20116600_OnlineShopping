package onlineshoppingpart2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johnson
 */
public class LoginConnector {
    //Establish a connection
    public static Connection  connectdb() {
        //Set connection to null
        Connection co=null;
        try {
        //Set connection to my Database: AccountName using the location
            //Connection equal to DriverManager(Location)
            co=DriverManager.getConnection("jdbc:derby://localhost:1527/AccountName", "pdc", "pdc");
            return co;
            //If an error occurs the Catch statement will catch it
        } catch (SQLException ex) {
            Logger.getLogger(LoginConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Return something like null
        return null;
    }
}
