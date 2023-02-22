package com.cognizant.tax;

public class Overloading_changing {
		static int sum(int a,int b) {
			return a+b;
		}
		static int sum (int a,int b,int c) {
			return a+b+c;
		}
		public static void main(String[] args) {
			System.out.println(Overloading_changing.sum(5,6));
			System.out.println(Overloading_changing.sum(5,6,7));
		}
	}

