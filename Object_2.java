package Object_class;
//3 ways to initialize object in java-By reference variable,By method,by constructor
class ObjectEg { //class 2
//Instance variable
	int id;
	String name;
}
class Object_2{ //main class
	public static void main(String[] args) {
		ObjectEg obj=new ObjectEg(); //create object--obj is our reference variable
		obj.id=101;
		obj.name="megha";
		System.out.println(obj.id+ " "+obj.name); // printing number with a white space
	}
}
