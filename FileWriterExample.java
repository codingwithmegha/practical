package IO;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterExample {
public static void main(String[] args) {
	try {
		//file reader also used to read the file
		FileWriter fw= new FileWriter("C:\\java_OI\\2.txt");
		fw.write("wlc to anudip foundtion skill development center");
		fw.close();
		FileReader fr= new FileReader("C:\\java_OI\\2.txt");//source code
		int i=0;
		while((i=fr.read())!=-1) {//to print the all string
			System.out.print((char)i);//convert into to character
		}
		fr.close();
		System.out.println();
		System.out.println("It's done");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
