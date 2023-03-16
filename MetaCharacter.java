package String;
//META CHARACTER
//  \\d-[0-9]
//  \\s-white space charater----------blank Space
//  \\w-[a-zA-Z0-9]
import java.util.regex.Pattern;
public class MetaCharacter {
public static void main(String[] args) {
	boolean b3=Pattern.matches("\\w{9}","Anudip123");
	System.out.println(b3);

}
}
