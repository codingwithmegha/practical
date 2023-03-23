package Exception_handling;
//constructor can throw an exception
public class ThrowsWithConstructor {
String name;
int age;
public ThrowsWithConstructor(String name, int age) throws Exception{
	if(age<18) {
		throw new Exception("Age should be more than 18");
	}
	this.name=name;
	this.age=age;
}
public static void main(String[] args) throws Exception {
	ThrowsWithConstructor ob=new ThrowsWithConstructor("Megha",34);
	System.out.println(ob.age+ ob.name);
}
}
