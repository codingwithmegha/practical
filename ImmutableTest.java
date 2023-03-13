package String;

public class ImmutableTest {
	public static void main(String[] args) {
		String str="megha";
		str.concat("tomar");  //insert the string at the end
		str=str.concat("tomar"); //it will print meghatomar
	    System.out.println(str);  
	}
}
