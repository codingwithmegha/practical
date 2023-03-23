package Exception_handling;
//checked exception
import java.io.IOException;
class Test {
void display() throws IOException{
	//System.out.println("Throws exception perfectly");
	throw new IOException("Throws exception perfectly");
  }
}
public class Throws_eg2{
	public static void main(String[] args) throws IOException {
		Test obj=new Test();
		obj.display();
	}
}
