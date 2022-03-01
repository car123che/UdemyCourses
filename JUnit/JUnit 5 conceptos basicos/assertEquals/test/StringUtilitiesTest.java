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
    public void testVowelCount(){
        String s = "hello";
        String t = "bcd";
        String u = "";
        String v = null;
        StringUtilities utilities = new StringUtilities();
        assertEquals(2, utilities.vowelCount(s));
        assertEquals(0, utilities.vowelCount(t));
        assertEquals(0, utilities.vowelCount(u));
        assertEquals(0, utilities.vowelCount(v));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
