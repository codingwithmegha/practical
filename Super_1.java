package Super_keyword;
//by using super keyword we can use parent class data member
class Shape{ // parent class
	String name="circle";  //data member of parent class
	}
class size extends Shape{  //child class
	String name="No Size"; //data member of child class
void print() { //child class method
	System.out.println(name);  //it represent child class
	System.out.println(super.name);//it represent immidiate parent class instance variable
}
}
public class Super_1 {
public static void main(String[] args) {
	size ob=new size();
	ob.print();
}
}
