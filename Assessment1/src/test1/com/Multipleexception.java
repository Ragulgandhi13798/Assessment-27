package test1.com;

public class Multipleexception {

	public static void main(String[] args) {
	
		  try{    
              int a[]=new int[5];    
              a[5]=30/0;    
             }    
             catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception occurs");  
                }    
	    	catch (ArrayIndexOutOfBoundsException e)
		{
	         System.out.println( e);
	      }
           System.out.println("other code will be rest");
	}}