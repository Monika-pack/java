package yieldthreadtopics;

public class ThreadYield extends Thread  
 {
	
	
	    public void run()  
	    {  
	        for (int i=0; i<3 ; i++)  
	            System.out.println(Thread.currentThread().getName() + "run in control");  
	    }  
	    public static void main(String[]args)  
	    {  
	    	ThreadYield t1 = new 
	    			ThreadYield();  
	    	ThreadYield t2 = new ThreadYield();  
	        // this will call run() method  
	        t1.start();  //runnable 
	        t2.start();  //runnable
	        for (int i=0; i<3; i++)  
	        {  
	            // Control passes to child thread //
	            t1.yield();  
	            System.out.println(Thread.currentThread().getName() + " Main in control");  
	        }  
	    }  
	

	public ThreadYield() {
		// TODO Auto-generated constructor stub
	}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


