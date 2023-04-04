package IO;
//we can read single character--using FileInputStream
import java.io.FileInputStream;
public class SingleCharFIS {
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\java_OI\\1.txt");  //source path
			//read Single Character
			int i=f.read();  //H=72 (byte value)
			{
				System.out.println((char)i);  //convert it into character
			}
			f.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
