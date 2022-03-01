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
public class Practice0 {
    
    int x = 2;
    int y = 2;
    int z = 3;

    //write a test method with an assert  htat shows x and y are equal to each other
    @Test
    public void test1(){
        assertEquals(x, y);
    }

    //write a test mehot with an assert that shows y and z are not equal to each other
    @Test
    public void test2(){
        assertNotEquals(y,z);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
