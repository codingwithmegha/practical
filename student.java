package Inheritance;

public class student {  //class 1
	int id;
	String name;
	Address address; //aggregation(entity ref of address class) 
	public student(int i,Address address,String name) { //parameterized cons
		this.id=id;
		this.name=name;
		this.address=address;
	}
void display() {//method
	System.out.println(id+" "+name);
    System.out.println(address.city+" "+address.state+" "+address.country);
}
public static void main(String[] args) {
	Address address1=new Address("abc","sw","india");
	Address address2=new Address("xyz","ft","india");
	student s=new student(12,address2,"pallabi");
	student s1=new student(12,address2,"anudip");
	s.display();
	s1.display();
}
}
