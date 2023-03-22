package Exception_handling;
//without try-catch
public class Without_exception {
public static void main(String[] args) {
	int num=10/0;  //it will ArithmeticException
			System.out.println(num);
		System.out.println("the end");  //it will not print because of ArithmeticException error
		//so we use try and catch block
}
}
