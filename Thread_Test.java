package Thread;

public class Thread_Test extends Thread {
	 public void run()  
     {    
       try {
    		System.out.println("Iam thread one.....!");
    		Thread.sleep(500);
       }
       catch(InterruptedException e)
       {
    	   System.out.println(e);
       }
     }  
     public static void main( String args[] )  
     {    
    	 Thread_Test t1 = new  Thread_Test();
    	 t1.run();
    	 try 
    		 {
    			 System.out.println("Iam thread two");
    			 Thread.sleep(1000);
    		 }
    		 catch(InterruptedException e) {
    			 System.out.println(e);
    		 }
    	    t1.start();  
     }  
}  
