/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 50256
 */
public class GraphicUtilities {
    public static void dim(int[] rgbArray){
        rgbArray[0] = Math.max(0, rgbArray[0] - 1); //red
        rgbArray[1] = Math.max(0, rgbArray[1] - 1); //green
        rgbArray[2] = Math.max(0, rgbArray[2] - 1); //blue
    }

    public static void brighten(int[] rgbArray){
        rgbArray[0] = Math.min(255, rgbArray[0] + 1); //red
        rgbArray[1] = Math.min(255, rgbArray[1] + 1); //green
        rgbArray[2] = Math.min(255, rgbArray[2] + 1); //blue
    }
}
