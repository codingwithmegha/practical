package mypackage;
public class Write_encapsulation {
private String name;
public void setName(String name) {
	this.name = name;
  }
public static void main(String[] args) {
	Write_encapsulation obj=new Write_encapsulation();
	obj.setName("Megha");
	//we cannot get the value,there is no get method
	System.out.println(obj.name);
}
}
