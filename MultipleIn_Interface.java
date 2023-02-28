package com.cognizant.tax;
//multiple inheritance----more than one parents class/interface
interface employee{  //parent interface 1
	void salary();  //abstract method salary for parent interface 1
}
interface Developer{ //parent Interface 2
	void Bonus();   //abstract method salary for parent interface 2
}
class Trainer implements employee,Developer{
	public void Bonus() {
	System.out.println("Bonus will be 10% of salary");
	}
	public void salary() {
    System.out.println("Salary incremented");
	}
}
public class MultipleIn_Interface {  //main class
	public static void main(String[] args) {  //main method
Trainer object=new Trainer();
object.Bonus();
object.salary();
}
}
