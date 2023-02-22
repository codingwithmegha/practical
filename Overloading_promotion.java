package com.cognizant.tax;

public class Overloading_promotion {
		void add (int a,int b) {
			System.out.println(a+b);
		}
		void add(int a,int b, int c) {
			System.out.println(a+b+c);
		}
		public static void main(String[] args) {
			Overloading_promotion obj=new Overloading_promotion();
			obj.add(2, 3);
			obj.add(10,20,30);
		}
		}

