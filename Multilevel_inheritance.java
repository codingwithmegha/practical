package Inheritance;
public class Multilevel_inheritance {
public static void main(String[] args) {    //main class
SIchild2 child=new SIchild2();   //create a object of child class
child.display();
child.show();
child.print();
}
}
class SIparent1 {  //parent class
	void show() { //parents class user defined method
		System.out.println("show the details");
		}
}
//child class of SIparent & parent class of SIchild2
 class SIchild1 extends SIparent1 {
	 void display() {  //child class user defined method
		 System.out.println("Display the result");
	 }
 }
 class SIchild2 extends SIchild1{ //child class
	 void print() { //child class user defined method
		 System.out.println("print the output");
	 }
 }