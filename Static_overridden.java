package com.cognizant.tax;
//we can't override static method
//Parent class
class Base{  //parent class--2 method add() non static print()
	// non-static method which will be overridden
	//in derived class
	public int add(int a,int b) {
		System.out.println("In the base class.");
		return a+b;
	}
	//ststic method which will not be overridden
	//in the derived class
public static void print() {
	System.out.println("In the Base class.");
}
}
//child class
class Derived extends Base{  //child class
	//This method overrides add() of the Base class
	//because it not a static method
	public int add(int a,int b) {
		System.out.println("In the child class.");
		return a+b;
	}
	//This method is hidden by print() in base
	public static void print() {
		System.out.println("In the child class.");
	}
}
// main class
public class Static_overridden {
public static void main(String[] args) {
	Base obj=new Derived();
	//here Derive's add() is called
	//according to overriding rules
	System.out.println(obj.add(4, 5));
	// This should invoke the print method of class Derived,
	//as per overriding rules.
	//because a static method can't be overridden,
	//it uses Base print instead
	obj.print();
}
}
