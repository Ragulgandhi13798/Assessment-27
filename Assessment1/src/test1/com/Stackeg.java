package test1.com;

import java.util.Iterator;
import java.util.Stack;

public class Stackeg {
	public static void main(String[] args) {
		 Stack<String> s = new Stack<String>();
		 s.push("abc");
		 s.push("qrs");
		 s.push("xyz");
		 
		 s.forEach(a ->  
		 {  
		 System.out.println(a);  
		 });     
		 }     
}
	
