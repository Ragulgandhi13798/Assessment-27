package test1.com;

public class Interruptmeet extends Thread 
	{  
		public void run()
		{  
		try
		{  
		Thread.sleep(1000); 
		}
		catch(InterruptedException e)
		{  
		System.out.println("Exception handled "+e);  
		}  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[])
		{  
			Interruptmeet t1=new Interruptmeet();  
			t1.start();  
		    t1.interrupt();  
		  
		}  

}
