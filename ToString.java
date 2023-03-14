package String;
//represent any object to strong
public class ToString {
	int rollno;  //integer type variable
	String name,addr;  //string
	ToString(int rollno,String name,String addr){
		this.rollno=rollno;
		this.name=name;
		this.addr=addr;
	}
	public String toString() {  //return object to string
		//return super.toString();  
		//object to String
		return rollno+" "+name+" "+addr;
		}
	public static void main(String[] args) {
		ToString s1=new ToString(1,"Ram","Mumbai");   //return the hashcode value of an object
		ToString s2=new ToString(2,"Karan","Delhi");
		System.out.println(s1);  //compiler write s1.toString()
		System.out.println(s2);
	}
}
