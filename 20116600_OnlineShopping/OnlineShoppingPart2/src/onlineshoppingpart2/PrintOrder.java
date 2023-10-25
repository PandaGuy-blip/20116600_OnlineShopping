package onlineshoppingpart2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Johnson
 */

public class PrintOrder {
    //Public void method to print Order
    public void printPath(Customer c, String total) {
        //PrintWriter currently equals to null
        PrintWriter outputStream = null;
        try {
            //override the file if it already exists
            outputStream = new PrintWriter(new FileOutputStream("./resources/order.txt"));
            //Fill in file using Customer details and Total amount
            outputStream.println(c.toString()+ "Your total is: "+total+
                    "\r\nplease pick up your order in 20m");
            //Message in console that the order has been placed
            System.out.println("Your order has been placed under files and resources named order.txt \r\n");
            //Close the file
            outputStream.close();
        //Catch any errors when opening the file
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file out.txt." + e.getMessage());
        }
    }
}