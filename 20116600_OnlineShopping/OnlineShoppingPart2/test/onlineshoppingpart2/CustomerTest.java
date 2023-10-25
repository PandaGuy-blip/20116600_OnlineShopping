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
public class CustomerTest {

    @Test
    public void testNameEqual() {
        Customer result = new Customer("Patrick", "Cash");
        Customer expResult = new Customer("Patrick", "Cash");
        assertSame(expResult, result);
    }

    @Test
    public void testAssertNull_Customer() {
        Customer c = new Customer("Patrick", "Cash");
        assertNotNull(c);
        assertNull(c.getPayment());
        assertNotNull(c.getName());
    }
    
}
