package Statics_program;
class Thiskeyword {//class1
int Id; //declare global variable
String ename;
double salary;
Thiskeyword(int Id,String ename,double salary)
{
	this.Id=Id;
	this.ename=ename;
	this.salary=salary;
}
void display()//user define method 
{
	System.out.println(Id+" "+ename+" "+salary);
}}
public class This_keyword{ // main class 2
	public static void main(String args[]) {
		//objects
		Thiskeyword s1=new Thiskeyword(1,"Megha",5000);
		Thiskeyword s2=new Thiskeyword(2,"Avni",6000);
		Thiskeyword s3=new Thiskeyword(3,"Bhumi",6900);
		Thiskeyword s4=new Thiskeyword(4,"Disha",6500);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
}
}
