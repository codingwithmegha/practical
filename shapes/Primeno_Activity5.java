package com.cognizant.shapes;

public class Primeno_Activity5 {  //main class
	public static void main(String[] args) {  // main method
		////Printing prime number by for loop//// 
           for(int i=1; i<=150; i++) {   //1 loop for every number between 1 to 150
        	int count=0;
		   for(int j=2; j<=i/2; j++) {  
		    if(i%j==0) {
		     count++;
		    }
		   }
            if(count==0) {
		    System.out.print(i+" ");
		   }
        }
	 }
   }

