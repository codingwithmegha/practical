package IO;
import java.io.*;
public class BufferedOS {
	public static void main(String[] args) {
//we connected one stream (FileOutputStream) with another (BufferedOutputStream)
		try {
			FileOutputStream f=new FileOutputStream("C:\\java_OI\\1.txt");
			BufferedOutputStream b=new BufferedOutputStream(f);
			String s="Welcome to coding world";
			byte b1[]=s.getBytes();  //converting string into byte array
			f.write(b1);
			b.flush(); //flushes the data of one stream and send it into another 
			f.close();
			b.close();
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
