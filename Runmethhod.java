package Thread;

public class Runmethhod extends Thread{
public void run() {
	System.out.println("Thread activated");
}
public static void main(String[] args) {
	Runmethhod r1=new Runmethhod();
	r1.run();
	r1.setName("Megha");
	String s=r1.getName();
	System.out.println(s);
}
}
