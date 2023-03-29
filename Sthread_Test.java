package Thread;
class Synchro_Test{
synchronized void display(int num) {
	for(int i=1;i<=5;i++) {		
		System.out.println(num+i);
		try {
			Thread.sleep(100);//to break for sec to print one the thread
		}catch(InterruptedException e) {
			System.out.println(e);
		}}}}
public class Sthread_Test {
			public static void main(String[] args) {
	Synchro_Test s1= new Synchro_Test();
	
	//1st thread object t1
Thread t1= new Thread() {
public void run() {
	s1.display(2);
}};
//2nd thread object
Thread t2= new Thread(){
public void run() {
	s1.display(5);
}
};
t1.start();
t2.start();
}
}


