package String;
import java.util.StringTokenizer;
public class StringTokenizerEg { //class
	public static void my() {   //my method
		StringTokenizer t=new StringTokenizer("Anudip Foundation skill and carrer Development Center");
		while(t.hasMoreTokens()) { //boolean method it check if there is more tokens available or not
			System.out.println(t.nextToken(" ")); //string method it return the next token from string token
			}
		StringTokenizer st=new StringTokenizer("I am & Megha &Staying in delhi");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken("&"));
		}
	}
	public static void main(String[] args) {
		my();
	}
}
