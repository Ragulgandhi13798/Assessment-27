package test1.com;

public class Maxchar7 {
public static void main(String[] args) {
	
	String s ="java";
    int[] f = new int[s.length()];  
    char  maxChar = s.charAt(0);  
    int i, j, max;          
      
    
    char string[] = s.toCharArray();  
      
    
    for(i = 0; i < string.length; i++) {  
        f[i] = 1;  
        for(j = i+1; j < string.length; j++) { 
        	
            if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') 
            {  
                f[i]++;  
                  
                
                string[j] = '0';  
            }  
        }  
    }  
    max = f[0];  
    for(i = 0; i <f.length; i++) {  
     
        if(max < f[i]) {  
            max = f[i];  
            maxChar = string[i];  
        }  
    }  
      System.out.println(maxChar);
 
}  
	
}
  

