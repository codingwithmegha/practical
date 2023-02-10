package Method_program;

public class default_parameter2 {
	int age;
	String name;
	default_parameter2(int a,String n){
		age=a;
		name=n;
	}
	void show() {
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
	}
	public static void main(String[] args) {
		default_parameter2 d1=new default_parameter2(20,"Megha");
		default_parameter2 d2=new default_parameter2(18,"Avni");
		default_parameter2 d3=new default_parameter2(16,"Disha");
		default_parameter2 d4=new default_parameter2(17,"Bhumi");
		d1.show();
		d2.show();
		d3.show();
		d4.show();
	}

}
