package Array;
public class Array_2 {
public static void main(String[] args) {
	int a[]=new int[5];  //declaration & instantiation
	//initialization
	a[0]=2;
	a[1]=9;
	a[2]=5;
	a[3]=7;
	a[4]=1;
	//traversing (printing one after another) an array using for each loop
	for(int i:a)
		System.out.println(i);
	//for(int i=0; i<a.length; i++) {  //length is one of the property of an array
		//System.out.println(a[i]);}
}
}
