package String;
import java.util.regex.*;
public class Regex4 {
	//Quantifiers
	//x? - x occur once or not at all   [abc]?
	//x+ -- x occur once or more then once
	//x*  - x occur zero or more time
	//x{n} - x occur n time
	//x{7} - x occur only 7 character//single character
	//x{n,} - x occur n or more time x(7) only 7 char or more
	public class Regex3 {
	public static void main(String[] args) {
		boolean b1= Pattern.matches("[A-Za-z0-9]{12}","Anudip123ppp");
	System.out.println(b1);
	boolean b2= Pattern.matches("[A-Za-z0-9.@]{19,}","Pallabi.Anudip@2023");
	System.out.println(b2);
	//boolean b3= Pattern.matches("[A-Za-z0-9.@]{19,}","Pallabi.Anudip@2023");
	//System.out.println(b3);
	}
	}
}