package Super_keyword;
class shape1{ //parent class
	void print() {  //parent class method
		System.out.println("Print circle");
		}
}
class size1 extends shape1{  //child class
	void print() {  //same method of parent class {child class method}
		System.out.println("Print trinagle");
	}
	void display() {//second method in class class
		System.out.println("print nothing");
	}
	void show() {//final method
		super.print(); //reference immediate parent method
		display();
		print();
	}
}
public class Super_2 {
public static void main(String[] args) {
	size1 ob=new size1();
	ob.show();
}
}
