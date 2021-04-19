package test1.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexoffirst {

	 public static void main(String[] args) 
	    {
	        String s = "Java is a programming language";
	          
	        Pattern p = Pattern.compile("\\b[a-zA-Z]");
	        Matcher m1 = p.matcher(s);
	        while (m1.find())
	        	
	         System.out.print(m1.group());
	    }
}