/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.*; //@BeforeAll, @AfterAll, @Test
/**
 *
 * @author 50256
 */
public class Theory {
    
    @BeforeAll
    public static void setup(){
        System.out.println("First");
    }

    @AfterAll
    public static void teardown(){
        System.out.println("last");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
