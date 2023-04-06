package IO;
import java.io.*;
//object input stream---deserilalization (byte stream to object)
class Student implements Serializable{
	int id;
	String name;
	int fee;
	public Student(int id, String name, int fee) {
		 this.id=id;
		 this.name=name;
		 this.fee=fee;
	}
}
public class DeserializationEg {
public static void main(String[] args) {
	try {
		ObjectInputStream obj=new ObjectInputStream(new FileInputStream("C:\\java_oi\\2.txt"));
	    Student s=(Student)obj.readObject();
	    System.out.println("id is :"+s.id+" "+"name is"+" "+s.name+" "+"fees is :"+s.fee);
	    obj.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}

}
}
