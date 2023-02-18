package My_code;
import java.util.Scanner;
public class Arithmatic_user {
public static void main(String[] args) {
	int sum,sub,mult,div;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the value of num1");
	int num1=sc.nextInt();
	System.out.print("Enter the value of num2");
	int num2=sc.nextInt();
	sum=num1+num2;
	sub=num1-num2;
	mult=num1*num2;
	System.out.println("Addition: "+sum+" "+"substraction: "+sub+" "+"multiplication: "+mult);
}
}
