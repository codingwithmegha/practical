package com.cognizant.tax;

public class Overloading_changing_Datatype {
		static int sum(int a,int b) {
			return a+b;
		}
		static double sum (double a,double b) {
			return a+b;
		}
		public static void main(String[] args) {
			System.out.println(Overloading_changing_Datatype.sum(5,6));
			System.out.println(Overloading_changing_Datatype.sum(5.3 , 6.4));
	}
	}


