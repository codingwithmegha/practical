package com.cognizant.tax;
//final method---cannot override the final method
class Finalmethod1 {  //parent class
final void display() {  //create a final method  
	System.out.println("this is my final method");
}
}
class child extends Finalmethod1{
	
}
public class Final_method{
public static void main(String args[]) {
	child obj=new child();
	obj.display();
}}

