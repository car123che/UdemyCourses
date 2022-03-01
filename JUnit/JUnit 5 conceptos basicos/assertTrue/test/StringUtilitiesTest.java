/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 50256
 */
public class StringUtilitiesTest {
    
   @Test
    public void testIsCapitalized(){
        String s = "Apple";
        String t = "apple";
        String u = "grape";
        String v = "";
        String x = null;

        StringUtilities utilities = new StringUtilities();
        assertTrue( utilities.isCapitalized(s));
        assertFalse( utilities.isCapitalized(t));
        assertFalse( utilities.isCapitalized(u));
        assertFalse( utilities.isCapitalized(v));
        assertFalse( utilities.isCapitalized(x));
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
