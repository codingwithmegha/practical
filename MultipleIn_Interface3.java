package com.cognizant.tax;
//Inheritance with Interface
interface parent{ //parent interface
	void show();
}
interface child0 extends parent{  //child interface(interface inherit interface with extend)
void display();
}
class child1 implements child0{   //another child class(interface inherit by class with implement)
	public void show() {
		
	}
	public void display() {
		System.out.println("child interface method");
	}
}
public class MultipleIn_Interface3 {
public static void main(String[] args) {
	child1 obj=new child1();
	obj.display();
	obj.show();
}
}
