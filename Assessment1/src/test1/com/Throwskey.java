package test1.com;

import java.io.IOException;
class A{  
	 void method()throws IOException
	 {  
	  System.out.println(" operation performed");  
	 }  
	}  
public class Throwskey {
	public static void main(String args[])throws IOException
	{
	     A m=new A();  
	     m.method();  
	  
	    System.out.println("normal flow thread");  
}
}


