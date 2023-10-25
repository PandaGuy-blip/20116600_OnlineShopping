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
public class Item {
    
//Private Variables For Items
    private String Name;
    private String Type;
    private double price;
//Name
    public String getName() {
	return Name;
    }
    public void setName(String Name) {
            this.Name =Name;
    }
//Type
    public String getType() {
            return Type;
    }
    public void setType(String type) {
            this.Type = type;
    }
//Price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
//Constructor 
    public Item(String name, String type, double price)
    {
            this.Name = name;
            this.Type = type;
            this.price = price;
    }
//toString
    public String toString() {
            return "Name: " +this.Name+ 
                    " Size: " +this.Type+
                    " Price: $" +this.price+ "\n";
    }
}//End of Class
