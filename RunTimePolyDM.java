package com.cognizant.tax;
// runtime polymorphism ant achieved by data member
public class RunTimePolyDM {
public static void main(String[] args) {
	papa_mamma object;
	object=new children1();
	System.out.println(object.priority);
	}
}
class papa_mamma{  //base class
	String priority="High";
}
class children1 extends papa_mamma{  //child class
	String priority="Super_High";
}