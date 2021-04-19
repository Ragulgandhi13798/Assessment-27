package test1.com;
class main extends Thread{
	
	 public void run()
	    {
	        System.out.println("Thread");
	        throw new RuntimeException();
	    }
	}

public class Exceptionthread {

	public static void main(String[] args) {
		   main t = new main();
		    t.start();
		    try {
		        Thread.sleep(40000);
		    }
		    catch (Exception e) {
		       
		        System.out.println("Exception" + e);
		    }

	}

}
