package Inheritance;
class parent1 {  //parent class
	int salary=30000;
		}

//child class of SIparent & parent class of SIchild2
class child1 extends parent1 {
		 int bonus=15000;
	 }

class child2 extends child1{ //child class
	 void show() { //child class user defined method
		int housing=2000;
		System.out.println("Salary is: "+salary);
		System.out.println("Bonus is: "+bonus);
		System.out.println("Housing allowance is: "+housing);
			int annualsal=salary+bonus+housing;
			System.out.println("Net salary is: "+annualsal);
	 }
}
public class Multilevel_inheritance2 {
	public static void main(String[] args) {
		child2 child=new child2();
		child.show();
	}
}