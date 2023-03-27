package Thread;
//create thread by extending thread class
public class ThreadEg_1 extends Thread{
public void run() {
	System.out.println("Iam Thread..........thread is running");
}
public static void main(String[] args) {
	ThreadEg_1 t=new ThreadEg_1();
	t.start();  //move the thread to the active state
	t.setName("Megha");
	String s=t.getName();
	System.out.println(s);
}
}
