package My_code;
import java.util.Scanner;
public class Fact_Normal {
public static void main(String[] args) {
	int fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n: ");
	int n=sc.nextInt();
	for(int i=1; i<=n; i++)
	{
		fact=fact*i;
	}
	System.out.println("The factorial is: "+fact);
}
}
