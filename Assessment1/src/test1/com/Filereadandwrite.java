package test1.com;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereadandwrite {

	  public static void main(String[] args)
	    {
	
	        try {
	  
	             FileReader fr = new FileReader("C:\\Users\\ragv2c18472\\Documents\\employee.txt");
	             FileWriter fw = new FileWriter("C:\\Users\\ragv2c18472\\Documents\\snt.txt");
	  
	            String str = "Global warming is one of the major disaster.";
	  
	            int i;
	            while ((i = fr.read()) != -1) {
	  
	            str += (char)i;
	            }
	  
	        
	            System.out.println(str);
	            fw.write(str);
	            fr.close();
	            fw.close();
	            System.out.println("File reading and writing both are done");
	        }
	  
	        catch (IOException e)
	        {
	            System.out.println(
	                "There are some IOException");
	        }
	    
}}
