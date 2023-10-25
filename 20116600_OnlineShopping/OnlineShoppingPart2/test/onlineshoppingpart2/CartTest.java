/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshoppingpart2;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnson
 */
public class CartTest {
    

    @Test
    public void testTotalCostFalse() {
        Cart cat = new Cart();
        String item = "Chicken";
        cat.getTotalCost(item);
    }

    @Test
    public void testTotalCostTrue() {
        Cart cat = new Cart();
        String item = "chiCken buRgeR";
        cat.getTotalCost(item);
    }

    
}
