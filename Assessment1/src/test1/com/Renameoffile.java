package test1.com;

import java.io.File;

public class Renameoffile {

	public static void main(String[] args) {
	    File file = new File("C:\\Users\\ragv2c18472\\Documents\\employee");
	 
        File rename = new File("C:\\Users\\ragv2c18472\\Documents\\snt");
  
        
        boolean flag = file.renameTo(rename);
  
        if (flag == true) {
            System.out.println("rename the file");
        }
     
        else {
            System.out.println("rename the file is not changed");
        }
    }
}
