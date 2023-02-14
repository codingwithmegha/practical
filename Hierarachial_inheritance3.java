package Inheritance;
class employee{
	int salary=10000;
	int bonus=1500;
	void action() {
		int updated_salary=salary+bonus;
		System.out.println(updated_salary);
	}
	}
class engineer extends employee{
	int benifit=10;
}
class doctor extends employee{
	int da=5;
}
public class Hierarachial_inheritance3 {
public static void main(String[] args) {
	engineer ob1=new engineer();
	System.out.println(ob1.salary+" "+ob1.benifit+"  incremented salary for engineers");
	ob1.action();
	doctor d=new doctor();
	System.out.println(d.salary+" "+d.da+"  incremented salary for doctor");
    d.action();
}
}
