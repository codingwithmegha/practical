package com.cognizant.tax;
// final variable---cannot change the value of final variable
public class Final_variable {
final int value=50; //final variable
void display() {
	System.out.println(value);
//we can't change the value of final variable
	//value=70;  // compile time error
}
public static void main(String[] args) {
	Final_variable fv=new Final_variable();
	fv.display();
}
}
