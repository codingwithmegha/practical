package Statics_program;

class Static_var {//class1
int rollno; //declare global variable
String name;
float fee;
static String college="VMLG";  // static void change(){
//constructor
Static_var(int rollno,String name,float fee)
{
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
}
void display()//user define method 
{
	System.out.println(rollno+" "+name+" "+fee+" "+college);
}}
public class Static_var1{ // main class 2
	public static void main(String args[]) {
		//objects
		Static_var s1=new Static_var(111,"Megha",5000);
		Static_var s2=new Static_var(112,"Avni",6000);
		Static_var s3=new Static_var(113,"Bhumi",6900);
		Static_var s4=new Static_var(114,"Disha",6500);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
}
}
