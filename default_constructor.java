package Method_program;

public class default_constructor {
	int age;
	String name;
	default_constructor() {
		 age=20;
		 name="Megha";
	}
	void show() {
		System.out.println("Age is :"+age );
		System.out.println("Name is :"+name);
		
	}
	public static void main(String[] args) {
		default_constructor d1=new default_constructor();
		default_constructor d2=new default_constructor();
		d1.show();
		
	}

}
