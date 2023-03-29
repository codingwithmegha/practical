package Thread;

class MyThreadClass {
void print(int num) {  //without synchronized method
	//synchronized void print(int num) {  //with synchorized method
	for(int i=1; i<=5; i++) {
		System.out.println(num*i);
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
			}
	}
	}
}
class Thread1 extends Thread{
	MyThreadClass ob;
	Thread1(MyThreadClass ob){
		this.ob=ob;
	}
	public void run() {
		ob.print(5);  //5*1 5*2 5*3 5*4 5*5=5 10 15 20 25
	}
}
class Thread2 extends Thread{
	MyThreadClass ob;
	Thread2(MyThreadClass ob){
		this.ob=ob;
	}
	public void run() {
		ob.print(2);  //2*1 2*2 2*3 2*4 2*5=2 4 6 8 10
	}
}
public class withoutSynchorized_method {
	public static void main(String[] args) {
		MyThreadClass o=new MyThreadClass();
		Thread t1=new Thread1(o);
		Thread t2=new Thread1(o);
		t1.start();
		t2.start();
	}
}
