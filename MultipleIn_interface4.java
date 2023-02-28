package com.cognizant.shapes;

interface parentInterface{
	void show();  //by default abstract method
	default void print() {   //java 8 onward
		System.out.println("Default method");
	}
	static void display() {  //java 8 onward
		System.out.println("static method");
	}
}
class MultipleIn_interface4 implements parentInterface {  //class implements Interface
	public void show() {
		System.out.println("Parent Interface method");
	}
	public static void main(String[] args) {
		MultipleIn_interface4 obj=new MultipleIn_interface4();
		obj.show();  //override abstract method
		obj.print(); //default method
		parentInterface.display();  //static method
	}

}

