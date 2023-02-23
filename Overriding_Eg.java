package com.cognizant.tax;
	class Exam{
		int marks () {
			return 0;
		}
	}
	class comp extends Exam{
		int marks () {
			return 80;
		}
	}
	class math extends Exam{
		int marks () {
			return 70;
		}
	}
	class science extends Exam{
		int marks () {
			return 50;
		}
	}
	class eng extends Exam{
		int marks () {
			return 90;
		}
	}
	public class Overriding_Eg {
	public static void main(String[] args) {
		Exam exam;
		exam = new science();
		System.out.println(exam.marks());
		exam = new eng();
		System.out.println(exam.marks());

}
	}