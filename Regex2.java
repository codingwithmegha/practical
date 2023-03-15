package String;
import java.util.regex.*;
public class Regex2 {
	public static void main(String[] args) {
		//1 st way
		Pattern p=Pattern.compile("..s"); //.(dot) represent a single character
		Matcher m=p.matcher("kss");
		boolean b=m.matches();  //true
		
		
		//2nd way
		boolean b2=Pattern.compile("s").matcher("kjs").matches();

		
		//3 way
		boolean b3=Pattern.matches(".s", "ks");
		System.out.println(b+" "+b2+" "+b3);
	}
}
