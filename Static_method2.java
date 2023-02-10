package Statics_program;
public class Static_method2 {
	int m=30;
	static int n=20;
	static int add(int a,int b) {
		return a+b;
	}
public static void main(String[] args) {
	int c=Static_method2.add(5, 4);
	System.out.println(c);
	System.out.println(n);
	Static_method2 s1=new Static_method2();
	System.out.println(s1.m);
}
}
