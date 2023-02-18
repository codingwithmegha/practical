package My_code;
import java.util.Scanner;
public class Celsius_convert {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of celsius: ");
    int c=sc.nextInt();
    int f=9*c/5+32;
    System.out.println("Temp converted into fahrenheit:- "+f);
}
}
