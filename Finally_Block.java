package Exception_handling;

public class Finally_Block {
public static void main(String[] args) {
	  //Exception not occure
	try {
		int a=4/2;
		System.out.println(a);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	   //Exception occure
		try {
			int a=4/0;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//Exception occure but not handeled
				try {
					int a=4/0;
					System.out.println(a);
				}
				catch(NullPointerException e) {
					System.out.println(e);
				}
	finally {
		System.out.println("Always finally block will execute");
	}
}
}
