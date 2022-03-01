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
public class Practice1 {
    
   int x = 2;
    int y = 2;
    int z = 3;

    boolean a = (x == y); //true
    boolean b = (y == z); //false

    //write a test with an assert that shows a is true
    @Test
    public void test1(){
        assertTrue(a);
    }

    //write a test with an assert that shows b is false
    @Test
    public void test2(){
        assertFalse(b);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
