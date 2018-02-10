import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

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
public class Generador {
    
    public void Generador()
    {
	    Random ran = new Random();
	    Integer[] x = new Integer[3000];
	    for (int i= 0; i < x.length; i++)
	        x[i] = ran.nextInt(101);
	    
	    File arc = new File("generado.txt");
	    BufferedWriter bw = null;
	    FileWriter fw = null;
	    try{
	       fw = new FileWriter(arc);
	       bw = new BufferedWriter(fw);
	        for (int i = 0; i< 3000; ){
	         bw.write(x[i]+"\n");
	        }
	        bw.close();
	        fw.close();
	    }
	    catch (IOException e){
	        System.err.println("Error: "+e.getMessage());
	    }
	    }
}
