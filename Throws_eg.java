package Exception_handling;

public class Throws_eg {
//whether the student is pass or not
	public static void mydisplay(int a) throws ArithmeticException{
		if(a>=0 && a<35) {
			//throw Arithmetic exception if not then fail
			throw new ArithmeticException("you are fail");
		}
		else {
			System.out.println("you are pass!!");
		}
	}
	public static void main(String[] args) {   //main method
		mydisplay(13);   //calling the function
		System.out.println("rest of the code.....");
	}
}
