package onlineshoppingpart2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johnson
 */
public class Customer {
//Variables
    private String Name;
    private String Payment;
//Getters
    public String getName() {
        return Name;
    }
    public String getPayment() {
        return Payment;
    }
//Setters
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setPayment(String Payment) {
        this.Payment = Payment;
    }
//Constructor
    public Customer(String Name, String Payment){
        this.Name = Name;
        this.Payment = Payment;
    }
//toString
    public String toString() {
        return "Your name is: " +Name+ 
                "\r\nYour Payment choice is: " +Payment+"\r\n";
    }
}//End of Class
