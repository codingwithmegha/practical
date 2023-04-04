package IO;
//write byte to string using FOS---write string with file output stream
import java.io.FileOutputStream;
public class WriteStringFOS {
public static void main(String[] args) {
try {
	FileOutputStream f=new FileOutputStream("C:\\java_OI\\1.txt");  //Destination
	f.write(82);  //byte value(ASCII value)
	f.close();
	System.out.println("done");
}
catch(Exception e) {
	System.out.println(e);
}
}
}
