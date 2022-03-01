/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 50256
 */
import java.util.*;

public class Data {
     public static int findLargest(ArrayList<Integer> nums){
        int largest = nums.get(0);
        for(int number: nums){
            if( number > largest){
                largest = number;
            }
        }
        return largest;
    }
}
