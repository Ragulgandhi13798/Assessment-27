package test1.com;

import java.util.ArrayList;

public class Commonelement 
	{
	    public static void main(String[] args)
	    {
	        String[] s1 = {"hi","how","are","you"};
	 
	        String[] s2 = {"hi","i","am","fine"};
	 
	       ArrayList<String> a = new ArrayList<String>();
	 
	        for (int i = 0; i < s1.length; i++)
	        {
	            for (int j = 0; j < s2.length; j++)
	            {
	                if(s1[i].equals(s2[j]))
	                {
	                  a.add(s1[i]);
	                }
	            }
	        }
	 
	        System.out.println(a);     
	    }
	}

