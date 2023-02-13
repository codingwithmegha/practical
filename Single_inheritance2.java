package Inheritance;
class SIparent2{  //parent class
	int salary=30000;  //parent class member
}
public class Single_inheritance2 extends SIparent2 {
	int bonus=1500;  //child class member
	int annualsal=salary+bonus;
	public static void main(String[] args) {
		Single_inheritance2 object=new Single_inheritance2(); 
			System.out.println("salary is: "+ object.salary);
			System.out.println("annual salary is: "+object.annualsal);
		}
	}
	


