package Statics_program;
class StaticMethod { //class 1
	//instance variable
int rollno;
String name;
float fee;
static String college="MIT";   //static variable
//Static method to change the value of static variable
static void change() { //static method
college="VMLG";}
	//parameterized constructor
	StaticMethod(int rollno,String name,float fee) {
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		}
	//user defined method
	void display() {
		System.out.println(rollno+ " "+name+" "+fee+" "+college);
	}
public class Statics_method {  //class 2
public static void main(String[] args) {
	//calling static method with class name
	StaticMethod.change();
	StaticMethod s1=new StaticMethod(102,"Ram",5000);  //creating object
	StaticMethod s2=new StaticMethod(103,"Sham",3000);
s1.display();
s2.display();
}
}}
