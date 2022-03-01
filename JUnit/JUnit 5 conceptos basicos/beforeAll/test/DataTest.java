/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.net.URL;
import java.io.File;
import java.io.FileNotFoundException;
import org.junit.jupiter.api.*; //@BeforeAll, @AfterAll, @Test
/**
 *
 * @author 50256
 */
public class DataTest {
    
    static ArrayList<Integer> numbersList;
    static URL path;
    static File file;
    static Scanner scanner;

    @BeforeAll //load the text file content into the array list
    public static void init() throws FileNotFoundException{
        numbersList = new ArrayList<Integer>();
        path = DataTest.class.getResource("numbers.txt");
        file = new File(path.getFile());
        scanner =  new Scanner(file);
        while(scanner.hasNext()){
            Integer i = Integer.parseInt(scanner.next());
            numbersList.add(i);
        }
    }

    @Test
    public void testFindLargest(){
        int computedValue = Data.findLargest(numbersList);
        int expectedValue = 40;
        assertEquals(expectedValue, computedValue);
    }

    @AfterAll
    public static void tearDown(){
        scanner.close();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
