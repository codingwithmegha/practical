package Inheritance;
class SIparent {  //parent class
	void show() {  //parent class user defined method
		System.out.println("Show the details");
	}
}
	class SIchild extends SIparent {  //child class
    void display() {  //child class user defined method
	System.out.println("Display the result");
    }
    public class Single_inheritance{
	public static void main(String[] args) {
	SIchild child=new SIchild();   //object of child class
	child.display();
	child.show();
	}
}
	}
	
