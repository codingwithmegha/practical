package String;
//char[] work same as java string
public class StringEg_1 {
public void show() { //method 1
	char arr[]= {'j','a','v','a'}; //char type array
	String s=new String(arr);
	System.out.println("value is :"+s); //java
	System.out.println(arr); //j a v a	
}
public void myFunction() {  //method2
	String s1="pallabi";
	String s2=new String(s1);
	System.out.println(s2);  //pallabi	
}
public static void main(String[] args) {
	StringEg_1 str=new StringEg_1();
	str.show();
	str.myFunction();	
}
}
