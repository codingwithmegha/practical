package Thread;
 //without wait(),notify(),notifyAll()
 class Aa {
	int i;
	synchronized void display(int i) {
		this.i=i;
		System.out.println("Data display: "+i);
	}
	synchronized int recieve() {
		System.out.println("Data recieved :"+i);
	return i;
	}
}
class Thread11 extends Thread{
	Aa obj;
	Thread11(Aa obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1; j<=10; j++) {
			obj.display(j);
		}
	}
}
class Thread22 extends Thread{
	Aa obj;
	Thread22(Aa obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1; j<=10; j++) {
			obj.recieve();
		}
	}
}

public class Inter_Thread_com {
public static void main(String[] args) {
	Aa obj=new Aa();
	Thread11 t=new Thread11(obj);
	Thread11 t1=new Thread11(obj);
	t.start();
	t1.start();
			}
}
