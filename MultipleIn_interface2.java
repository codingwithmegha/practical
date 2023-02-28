package com.cognizant.tax;
interface New_Employee{  //parent interface 1
	void salary();  //abstract method salary for parent interface 1
}
interface New_developer{  //parent interface 2
	void salary();   //abstract method salary for parent interface 2
}
class Trainer1 implements New_Employee,New_developer{
	public void Bonus() {
	System.out.println("Bonus will be 10% of salary");
	}
	public void salary(){
    System.out.println("Salary incremented");
	}
}
public class MultipleIn_interface2 {  //main class
public static void main(String[] args) {  //main method
	Trainer1 object=new Trainer1();
	object.salary();
}
}
