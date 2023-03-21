package Exception_handling;
import java.util.Scanner;
public class InputMismatch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any two number");
	try {
		int x=sc.nextInt();
	    int y=sc.nextInt();
	    System.out.println("Result: "+x/y);
	}
	catch(Exception e){
		System.out.println(e);
	}
   }
  }
