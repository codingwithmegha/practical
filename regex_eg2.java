package String;
import java.util.regex.*;
public class regex_eg2 {
	public static void main(String[] args) {
		boolean b2=Pattern.matches("[0-9a-z.@]{23}","meghatomar361@gmail.com");
		System.out.println(b2);

}

}
