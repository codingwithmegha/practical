package com.cognizant.shapes;

interface ParentInterface1{
	void shape_name(); //by default abstract method
}
class circle implements ParentInterface1{   //1 class implements interface

	@Override
	public void shape_name() {
		System.out.println("Draw a circle");
		}
	}
class triangle implements ParentInterface1{    //2 class implements interface

	@Override
	public void shape_name() {
		System.out.println("Draw a triangle");
		
	}
	
}
public interface Interface_2   {  //main class
public static void main(String[] args) {   //main method
	ParentInterface1 obj=new circle();  //object of 1 class
	ParentInterface1 object=new triangle();  //object of 2 class
	object.shape_name();
	obj.shape_name();
}
}
