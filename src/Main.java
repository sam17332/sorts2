import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hector Valle
 * @author Rodrigo Samayoa
 * 
 */
public class Main 
{
    static Sorts s= new Sorts();
    public Generador g ;
    
    public void Main()
    {
         Generador g = new Generador();
      
    }
     
    public static void main(String[] args)
    {
        String linea = "";
        Integer arr[] = new Integer[3000];
        try{
           int i = 0;
           File arc = new File("generado.txt");
           BufferedReader br = new BufferedReader(new FileReader(arc));
           while((linea = br.readLine()) != null){
               linea = br.readLine();
               arr[i] = Integer.parseInt(linea);
           }
           s.mergeSort(arr,0,arr.length-1);
        }catch(FileNotFoundException ex){
            System.out.println("Error no encontrado");
        }catch(IOException ex){
           System.out.println("Error");
        }
        //ar = gnomeSort(arr);
        //mergeSort(arr, 0 , arr.length-1);
        //s.radixSort(a);
        System.out.println(Arrays.toString(arr));
    }
    
}
