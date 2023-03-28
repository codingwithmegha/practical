package Thread;

public class Sleep_methodEg extends Thread {
public void run() {
	for(int i=0; i<=5; i++) {
		try {
			Thread.sleep(800);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
	}
}
public static void main(String[] args) {
	Sleep_methodEg t=new Sleep_methodEg();
	Sleep_methodEg t1=new Sleep_methodEg();
	t.start();
	t1.start();
}
}
