package Array;

public class Anonymous {
 static void print(int arr[]) {  //static print method receives an array as a arguments/parameter
	 for(int i=0; i<arr.length; i++)
		 System.out.println(arr[i]);
}
 public static void main(String args[]) {
	 print(new int[] {10,20,30,40,50,80}); //passing anonymous array to method print
     }
  }
