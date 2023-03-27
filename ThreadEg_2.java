package Thread;
//directly we use thread class without extend
//with and without setname we can name the thread
public class ThreadEg_2 {
	public void run() {
		System.out.println("pinki");
	}
	public static void main(String[] args) {
		//creating an object of the thread class using the thread constructor ---thread(String name)
		Thread t=new Thread("Megha");
		Thread t1=new Thread();
//		ThreadEg_2 e=new ThreadEg_2();
//		e.run();
		t.start();
		t1.start();
		t1.setName("Anudip");
		System.out.println("Thread 0: "+t.getName());
		System.out.println("Thread 1: "+t1.getName());
	}


}
