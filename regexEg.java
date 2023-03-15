package String;
import java.util.regex.Pattern;
public class regexEg {
public static void main(String[] args) {
	boolean b7=Pattern.matches("[A-Za-z0-9+@+.]","Pallabi.Anudip@2023");
	System.out.println(b7);
	boolean b2=Pattern.matches("[0-9]{10}","8178440378");
	System.out.println(b2);
	boolean b3=Pattern.matches("[6789]{1}[0-9]{9}","8178440378");
	System.out.println(b3);
}
}
