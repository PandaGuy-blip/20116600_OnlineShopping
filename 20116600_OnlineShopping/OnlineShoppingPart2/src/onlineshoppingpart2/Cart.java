package onlineshoppingpart2;


import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johnson
 * List of the food items
 */
public class Cart {
//Array list using Item class
    public ArrayList<Item> list;
//Create menu items to list
    Item Cheeseburger = new Item("CheeseBurger", "Main", 10.00);
    Item ChickenBurger = new Item("Chicken Burger", "Main", 12.00);
    Item VeggieBurger = new Item("Veggie Burger", "Mains", 9.00);
    Item Fries = new Item("Fries", "Side", 3.50);
    Item Wedges = new Item("Wedges", "side", 4.00);
    Item ChickenWings = new Item("Chicken Wings", "Side", 6.00);
    Item Pepsi = new Item("Pepsi", "Drink", 2.50);
    Item Fanta = new Item("Fanta", "Drink", 2.50);
    Item Lemonade = new Item("Lemonade", "Drink", 3.50);
//Constructor 
    public Cart()
    {
        list = new ArrayList<>();
    //Add menu items to list
        list.add(Cheeseburger);
        list.add(ChickenBurger);
        list.add(VeggieBurger);
        list.add(Fries);
        list.add(Wedges);
        list.add(ChickenWings);
        list.add(Pepsi);
        list.add(Fanta);
        list.add(Lemonade);
    }
//TotalCost    
    //Find the total Cost of all Customer's order using Customer input
    public double getTotalCost(String input) {
    //Total variable to calculate the cost
        double total = 0;
        //For loop between Item and List
        for (Item item : list) {
            //If Customer input matches one of the menu item
            //Total equals to that item
            if(item.getName().equalsIgnoreCase(input)){
            total += item.getPrice();    
            }//End of If Loop
        }//End of For Loop
    //return the total cost
        return total;
    }
//toString
    public String toString() {
        String results = "";
            System.out.println(Arrays.toString(list.toArray()).replace(",", "")  //remove the commas
            .replace("[", "")  //remove the right bracket
            .replace("]", "")  //remove the left bracket
            .trim());           //remove trailing spaces
        return results;
      }
}//End of Class
