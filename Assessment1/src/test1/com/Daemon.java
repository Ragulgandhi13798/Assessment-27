package test1.com;

public class Daemon extends Thread {
	public Daemon(String name){
        super(name);
    }
  
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        { 
            System.out.println("Daemon thread"+" " +getName()); 
        } 
          
        else
        { 
            System.out.println("user thread"+" " +getName()); 
        } 
    } 
      
    public static void main(String[] args)
    { 
      
        Daemon t1 = new Daemon("t1");
        Daemon t2 = new Daemon("t2");
        Daemon t3 = new Daemon("t3");
      
      
        t1.setDaemon(true);
        t1.start(); 
        t2.start();
        t3.start();        
    }

}
