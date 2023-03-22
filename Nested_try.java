package Exception_handling;
public class Nested_try {
public static void main(String[] args) {
	//outer try block
	try {
		
		try {
			//1st inner try block
		int a=10/0;   //ArithmeticException
		System.out.println(a);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	// 2nd inner try block
	try {
		int arr[]=new int[3];
		int a=5;
		arr[2]=22;
		System.out.println(a);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	System.out.println("both inner try done");
}
	//outer catch 
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("done");
}
}
