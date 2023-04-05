package IO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ConsoleExample {
public static void main(String[] args) {
	try {
		FileInputStream fin=new FileInputStream("C:\\java_OI\\2.txt");
		FileOutputStream fout=new FileOutputStream("C:\\java_OI\\2.txt");  //write
		byte arr[]=new byte[1024];
		int l;
		while((l=fin.read(arr))>0) {
			fout.write(arr);
		}
		fin.close();
		fout.close();
		System.out.println("done");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
