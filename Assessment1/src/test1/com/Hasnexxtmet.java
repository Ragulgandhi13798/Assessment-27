package test1.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hasnexxtmet {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("surya");
		a.add("karthi");
		a.add("ravi");
		a.add("Tom");
		
		Iterator<String> i = a.iterator();
        while(i.hasNext())
		
	    System.out.println(i.next());
		

	}

}
