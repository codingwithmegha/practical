package controlSystem;
import java.util.Scanner;
public class Inputuser {
public static void main(String[] args) {
	int sum=0;
	int num=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number");
	int num1=sc.nextInt();
	while(num>=0)
	{
		sum=sum+num;
		System.out.println("enter your number");
		num=sc.nextInt();
	}
	System.out.println("sum is:"+sum);
	sc.close();
}
}
