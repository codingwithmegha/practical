package Exception_handling;

public class MultiCatch_Block {
	static void display() {  //method
		   try {
			 int i=50/2; //Arithmatic exception
			 System.out.println(i);  //Arithmetic
			 int arr[]=new int[3];  //ArrayIndexOutOfbound
			 arr[7]=24;
		   }
		   catch(ArithmeticException e) {
			   System.out.println("only 1st Arithmatic exception will execute");
		   }
		   catch(ArrayIndexOutOfBoundsException ae) {
			   System.out.println("Now Array index out of bond will occure");
		   }
		   finally {
			   System.out.println("Iam Finally block");
		   }
	}
		 public static void main(String args[]) {
			 display();
		 }
}
	
	
