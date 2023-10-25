/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshoppingpart2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import org.junit.Test;

/**
 *
 * @author Johnson
 */
public class PrintOrderTest {
    
    @Test
    public void testCustomer_WithIntToString_PASS(){
        PrintOrder order = new PrintOrder();
        String name = "Name";
        String payment_choice = null;
        int total = 50;
        String new_total = Integer.toString(total);
        Customer c = new Customer(name, payment_choice);
        order.printPath(c, new_total);
    }
    
    @Test
    public void testTry_And_Catch_FAIL(){
        try {
            FileReader reader = new FileReader("./resources/receipt.txt");
            BufferedReader br = new BufferedReader(reader);
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file out.txt." + e.getMessage());
        }
    }
}
