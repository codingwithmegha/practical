package Inheritance;
class vehicle1{ //parent class A
	void running() {
		System.out.println("running mode on");
	}
}
class car1 extends vehicle1 {  //child class1
	void run() {
		System.out.println("car run mode on");
	}
}
class bike1 extends vehicle1{ // child class 2
	void speed() {
		System.out.println("speed is very high");
	}
}
public class Hierarchial_inheritance1 {
public static void main(String[] args) {
	bike1 b=new bike1();
	b.speed();
	b.running();
	car1 c=new car1();
	c.run();
	c.running();
}
}
