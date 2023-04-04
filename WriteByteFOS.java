package IO;
import java.io.FileOutputStream;
//write String to byte array----write byte with file output Stream
public class WriteByteFOS {
	public static void main(String[] args) {
		try {
			FileOutputStream f=new FileOutputStream("C:\\java_OI\\1.txt");  //Destination
			String s="Welcome to Anudip Foundation";
			byte b[]=s.getBytes();  //converting string into byte array
			f.write(b);
			f.close();
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
