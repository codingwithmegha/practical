package String;
import java.util.regex.Pattern;
public class Regex_3 {
//character class
	//[abc]=a,b,c only these 3 char(single)
	//[a-zA-z]=either upper/lower case and both (single char)
	//[^abc]=any char except abc,(single char)
	public class Regex2 {
		public static void main(String[] args) {
		boolean b1= Pattern.matches("[a-aZ-Z]","Z");	
		boolean b2= Pattern.matches("[pqr]","p");	
		boolean b3= Pattern.matches("[^abc]","z");	
		System.out.println(b1+" "+b2+" "+b3);
		}

	}
}
