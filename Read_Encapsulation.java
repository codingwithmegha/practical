package mypackage;
//we can read only (only getter method)
public class Read_Encapsulation {
	private String name="Megha";
	//getting the name
	public String getname() {
		return name;
	}
	public static void main(String[] args) {
	Read_Encapsulation obj=new Read_Encapsulation();
	//obj.set_name("Sana");  //we can't change the values of the name
	System.out.println(obj.name);
	}
}
