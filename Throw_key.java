package Exception_handling;
//wheather a students is eligible for java course or not
public class Throw_key {
public static void check(int marks) {
	if(marks<60) {
		//throw instance=throw keyword new and then exception
		throw new ArithmeticException("Student is not eligible for course");
	}
	else {
		System.out.println("Student is eligible for course");
	}
}
public static void main(String[] args) {
	check(58);
}
}
