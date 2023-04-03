package Thread;
class Sync1 {
	int i;
	boolean flag=false;
	synchronized void display(int i) {
		if(flag)
		try {
			wait();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		this.i=i;
		flag=true;
		System.out.println("Data display: "+i);
		notify();
	}
	synchronized int recieve() {
		if(!flag)
			try {
				wait();
			}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Data recieved :"+i);
	return i;
	}
}
class first_Thread11 extends Thread{
	Sync1 obj;
	first_Thread11(Sync1 obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1; j<=10; j++) {
			obj.display(j);
		}
	}
}
class second_Thread22 extends Thread{
	Sync1 obj;
	second_Thread22(Sync1 obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1; j<=10; j++) {
			obj.recieve();
		}
	}
}

public class Inter_thread_com2 {
	public static void main(String[] args) {
		Sync1 obj=new Sync1();
		first_Thread11 t=new first_Thread11(obj);
		second_Thread22 t1=new second_Thread22(obj);
		t.start();
		t1.start();
				}

}
