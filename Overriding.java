package com.cognizant.tax;

  class Overriding {
		void run() {
			System.out.println("Running Mode ON");
		}
	}
	class OverridingEg extends Overriding{
			void run() {
				System.out.println("Running Mode OFF");
			}
			public static void main(String[] args) {
				OverridingEg o=new OverridingEg();
				o.run();
				
		}
	}

