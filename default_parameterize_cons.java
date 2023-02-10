package Method_program;
import java.util.*;
public class default_parameterize_cons {
		int a;
		int b;
		// Default Constructor
		default_parameterize_cons(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the First Number");
			a=sc.nextInt();
			System.out.println("Enter the Second Number");
			b=sc.nextInt();
		}
		// Parameterized Constructor
		default_parameterize_cons(int x,int y){
			a=x;
			b=y;
		}
		// Show Constructor
		void show() {
			int c=a+b;
			System.out.println("Sum is : "+c);
		}
		public static void main(String[] args) {
			default_parameterize_cons d=new default_parameterize_cons();
			//default_parameterize_cons d1=new default_parameterize_cons(8,15);
			d.show();
			//d1.show();
		}

	}

