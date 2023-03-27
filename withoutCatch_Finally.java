package Exception_handling;
public class withoutCatch_Finally {
public static void main(String[] args) {
	int arr[]=new int[3];
	try {
		/*arr[7]=3;
		System.out.println(arr[1]);*/
	}
	finally {
		arr[7]=3;
		System.out.println(arr[1]);
		System.out.println("Finally");
	}
}
}
