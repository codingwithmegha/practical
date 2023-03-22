package Exception_handling;
//another unchecked example of throw keyword
public class Throw_test {
  //defining method
	public static void checknum(int num) {
		if(num<0) {
			throw new ArithmeticException("number is negative");
		}
		else {
			System.out.println("number is positive");
		}
	}
	public static void main(String[] args) {
		checknum(-1);
		System.out.println("Executed");
	}
}
