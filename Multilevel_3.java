package Inheritance;
	class parent12{  //parent class
		int salary=30000;  //parent class member
	}
	class child12 extends parent1 {
		int bonus=1500;    //child class member
		int annualsal=salary+bonus;
	}
	class child22 extends child12 {
		int da=200;
		int totalsal=annualsal+da;
		
	public static void main(String[] args) {
	child22 object=new child22();
	System.out.println("salary is: "+object.salary);
	System.out.println("annual salary is: "+object.annualsal);
	System.out.println("Total salary is: "+object.totalsal);

	}
	}

