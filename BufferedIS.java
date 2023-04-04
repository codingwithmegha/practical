package IO;
import java.io.*;
//read the data from my source file by using BufferdInputStream
public class BufferedIS {
public static void main(String[] args) {
	try {
		//source file
		FileInputStream f=new FileInputStream("C:\\java_OI\\1.txt");
		BufferedInputStream b=new BufferedInputStream(f);
		int i;
		while ((i=b.read())!=-1) {
			System.out.print((char)i);  //convert it into character
		}
		f.close();
		b.close();
	}
	catch(Exception e) {
		System.err.println(e);
	}
}
}
