/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
/**
 *
 * @author 50256
 */
public class Theory {
    
     @Test
    public void myTest(){
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 7, 7};
        int[] array4 = {1, 2, 3, 4};

        assertArrayEquals(array1, array2); //pass
        assertArrayEquals(array2, array3); //fail
        assertArrayEquals(array3, array4); //fail
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
