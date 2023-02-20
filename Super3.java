package Super_keyword;
class shape2{  //parent class
	//constructor of parent class
	shape2()
	{
		System.out.println("Hello");
	}
}
class size2 extends shape2{  //child class
	//Constructor of the child class
	size2(){
		//invoke immediate parent class constructor line no 4
		super();
		System.out.println("hi");
	}
}
public class Super3 {
public static void main(String[] args) {
	size2 obj=new size2();  //creating object of child class
}
}
