package Thread;

public class ThreadEg_3 extends Thread {
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}//System.out.println(Thread.currentThread().getName());
public static void main(String[] args) {
	ThreadEg_3 t=new ThreadEg_3();
	ThreadEg_3 t1=new ThreadEg_3();
	ThreadEg_3 t2=new ThreadEg_3();
//	t.run();
//	t1.run();
//	t2.run();
	t.start();
	try {
		t.join();
	}
	catch (InterruptedException e){
		System.out.println(e);		
	}
	t1.start();
	try {
		t1.join();
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
}
}
