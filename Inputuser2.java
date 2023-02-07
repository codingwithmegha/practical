package controlSystem;
import java.util.Scanner;
public class Inputuser2 {
	public static void main(String[] args) {
		int sum=0;
		int number=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
	while(true)
	{
		number=sc.nextInt();
		if(number<0)break;
		sum=sum+number;
	}
	System.out.println("sum is:"+sum);
	sc.close();
	}

}
