package Object_class;
//how to define a class and field(data members/variable)
public class Object_1 {
	//defining fields(instance variable)
int id;
String Bname;
public static void main(String[] args) {
	// creating object
	Object_1 b1=new Object_1();
	Object_1 b2=new Object_1();
	//print vlaue
	b1.id=101;
	b1.Bname="C4119abc";
	b2.id=102;
	b2.Bname="C4111xyz";
	System.out.println("Id is: "+b1.id+ " "+"Batch_Name is: "+b1.Bname);
	System.out.println("Id is: "+b2.id+ " "+"Batch_Name is: "+b2.Bname);
}
}
