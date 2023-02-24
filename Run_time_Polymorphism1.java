package com.cognizant.tax;
//runtime polymorphism---Dynamic method Dispatch
//overload a static method in java-compile time poly 
public class Run_time_Polymorphism1 {
//overridden method called by the reference variable of parent class
	//overridden method is resolved at runtime rather than compile time
public static void main(String[] args) {
	Java_student js;  //reference variable of parent class
	js=new Sana();
	System.out.println("Quality of sana is : "+js.quality());
	js=new Hemant();
	System.out.println("Quality of hemant is : "+js.quality());
	js=new Ritu();
	System.out.println("Quality of Ritu is : "+js.quality());
} 
}
class Java_student{
	String quality() {
		return null;
	}
}
class Ritu extends Java_student{
	String quality() {
		return "Artists";
	}
}
class Hemant extends Java_student{
	String quality() {
		return "Active";
	}
}
class Sana extends Java_student{
	String quality() {
		return "Good_in_nature";
	}
}
class Prince extends Java_student{  //child class 4
	String quality() {
		return "Unable_to_run_code";
	}
}