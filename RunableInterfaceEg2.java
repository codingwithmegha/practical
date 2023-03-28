package Thread;
//Thread(Runnable obj, String name)
public class RunableInterfaceEg2 implements Runnable{
public void run() {
	System.out.println("Thread Running");
}
public static void main(String[] args) {
	//creating object of runnableInterfaceEg2
	Runnable ri=new RunableInterfaceEg2();
	//creating object of thread class using thread(runnable ref var, String name
	Thread t=new Thread(ri,"Megha");
	t.start();
	String s=t.getName();
	System.out.println(s);
}
}
