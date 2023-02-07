package controlSystem;
import java.util.Scanner;
public class Inputuser3 {
	
		public static void main(String[] args) {
			int sum=0;
			int number=0;
			Scanner sc=new Scanner(System.in);
			do {
				sum=sum+number;
			System.out.println("enter the number");
			number=sc.nextInt();
			}while(number>=0);
		{
		System.out.println("sum is:"+sum);
		sc.close();
		}

	}

}
