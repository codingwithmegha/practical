package Method_program;
import java.util.*;
public class method_2 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First Number");
			int a=sc.nextInt();
			System.out.println("Enter Second Number");
			int b=sc.nextInt();
			int c=Addition(a,b);
			System.out.println("Sum is : "+c);
		}
		public static int Addition(int n1,int n2) {
			int sum=n1+n2;
			return sum;
			
		}

	}


