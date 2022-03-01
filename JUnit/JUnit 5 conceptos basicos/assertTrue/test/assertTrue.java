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
public class assertTrue {
    
    @Test
    public void test1(){
        assertTrue(true);
    }

    @Test
    public void test2(){
        assertTrue(2 == 2);
    }
    
    @Test
    public void test3(){
        assertTrue("abc".length() == 3);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
