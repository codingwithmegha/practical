package mypackage;
public class Encapsulation_1eg {
public static void main(String[] args) {
	Encapsulation_1 obj=new Encapsulation_1(); //creating the object of encapsulated person class	
    obj.setName("Megha");  //setting value in the name
    obj.setAge(20);   //setting value in age
    System.out.println("Name is :"+obj.getName());  //getting the value of name
    System.out.println("Age is :"+obj.getAge());    //getting the value of age
}
}
