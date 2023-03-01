package mypackage;
//if we create fully encapsulated class in java than we have to make all the data members of class private
//we can use setter getter methods to set and get the data
public class Encapsulation_1 {
	private String name;  //private variable 
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
   }