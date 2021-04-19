package test1.com;

import java.util.HashMap;
import java.util.Map;

public class Mapiterate {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer,String>();
		h.put(11,"viki");
		h.put(12,"vijay");
		h.put(13,"ajith");
		h.put(14,"karthi");
		
		for (Map.Entry<Integer, String> set :h.entrySet()) 
		{
		    System.out.println(set.getKey() + " = " + set.getValue());
		    
		    
		}
	}

}
