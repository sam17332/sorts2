/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hecto
 */
public class SortsTest {
    
    public SortsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of gnomeSort method, of class Sorts.
     */
    @Test
    public void testGnomeSort() {
        System.out.println("gnomeSort");
        Sorts instance = new Sorts();
        Integer [] num = {5,7,1,3,4};
        assertEquals("[1, 3, 4, 5, 7]",Arrays.toString(instance.gnomeSort(num)));
        
    }

    /**
     * Test of merge method, of class Sorts.
     */
    @Test
 

    /**
     * Test of mergeSort method, of class Sorts.
     */
    public void testMergeSort() {
        System.out.println("mergeSort");
        Sorts instance = new Sorts();
        Integer [] num = {5,7,1,3,4};
        assertEquals("[1, 3, 4, 5, 7]",Arrays.toString(instance.mergeSort(num,0,num.length-1)));
    }

    

    /**
     * Test of radixSort method, of class Sorts.
     */
    @Test
    public void testRadixSort() {
        System.out.println("radixSort");
        Sorts instance = new Sorts();
        Integer [] num = {5,7,1,3,4};
        assertEquals("[1, 3, 4, 5, 7]",Arrays.toString(instance.radixSort(num)));
    }
    

    /**
     * Test of quickSort method, of class Sorts.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        Sorts instance = new Sorts();
        Integer [] num = {5,7,1,3,4};
        assertEquals("[1, 3, 4, 5, 7]",Arrays.toString(instance.quickSort(num, 0, num.length-1)));
    }

    /**
     * Test of insertionSort method, of class Sorts.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("insertionSort");
         Sorts instance = new Sorts();
        Integer [] num = {5,7,1,3,4};
        assertEquals("[1, 3, 4, 5, 7]",Arrays.toString(instance.insertionSort(num, num.length)));
    }
    
}
