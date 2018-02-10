

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class Main {
    
    static Sorts s= new Sorts();
     public void Main(){
      
     }
     
      public static void main(String[] args){
         Random ran = new Random();
         Integer[] x = new Integer[3000];
         for (int i= 0; i < x.length; i++)
             {
                x[i] = ran.nextInt(101);
              }
	//for(int j = 0; j < arr.length ; j++)
	//System.out.println(arr[j]);
        // s.mergeSort(arr,0,arr.length-1);
        System.out.println("Gnome Sort");
        System.out.println(Arrays.toString(s.gnomeSort(x)));
        System.out.println("Insertion Sort");
        System.out.println(Arrays.toString(s.insertionSort(x, x.length)));
        System.out.println("Quick Sort");
        System.out.println(Arrays.toString(s.quickSort(x, 0, x.length-1)));
        System.out.println("Merge Sort");
        System.out.println(Arrays.toString(s.mergeSort(x, 0, x.length-1)));
        System.out.println("Radix Sort");
        System.out.println(Arrays.toString(s.radixSort(x)));
        //ar = gnomeSort(arr);
        //mergeSort(arr, 0 , arr.length-1);
        //s.radixSort(a);
        //System.out.println(Arrays.toString(arr));
    }
    
}
