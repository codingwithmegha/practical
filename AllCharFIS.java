package IO;
//we can read All character--using FIleInputStream
import java.io.FileInputStream;
//read all character
public class AllCharFIS {
public static void main(String[] args) {
	try {
		FileInputStream f=new FileInputStream("C:\\java_OI\\1.txt");  //source path
       int i=0;
       while((i=f.read())!=-1){
	  System.out.print((char)i);  //convert it into character
		}
		f.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}

