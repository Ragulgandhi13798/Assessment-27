package test1.com;

import java.io.File;

public class Comparefilepath {
	public static void main(String[] args)
	{
	             File file1 = new File("C:\\Users\\ragv2c18472\\Documents.txt");
		        File file2 = new File("C:\\Users\\ragv2c18472\\Documents");
		       
		
		        if (file1.compareTo(file2) == 0) {
		            System.out.println("path are same");
		        }
		        else {
		            System.out.println("path are not same");
		        }
	}
}

