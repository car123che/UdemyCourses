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
public class GraphicsUtilitiesTest {
    
   @Test
    public void testDim(){
        int[] pixel = {1,2,3};
        GraphicUtilities.dim(pixel);
        int[] expected = {0 , 1 , 2};
        assertArrayEquals(expected, pixel);
        GraphicUtilities.dim(pixel);
        expected = new int[]{0,0,1};
        assertArrayEquals(expected, pixel);
    }

    @Test
    public void testBrighten(){
        int[] pixel = {1,254,254};
        GraphicUtilities.brighten(pixel);
        int[] expected = {2 , 255 , 255};
        assertArrayEquals(expected, pixel);
        GraphicUtilities.brighten(pixel);
        expected = new int[]{3,255, 255};
        assertArrayEquals(expected, pixel);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
