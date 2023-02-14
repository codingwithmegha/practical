package Inheritance;
class aggregationeg{  //class 1
	int square(int r) {//method name space
		return r*r;
	}
}
class circle{  //class 2
    double pi=3.14;
    double area(int radius) {  // circle class method(pi*r*r)
    	aggregationeg ref_var=new aggregationeg();  //object
    	int psquare=ref_var.square(radius);  // radius*radius
    	return pi* psquare;
    }
	public static void main(String[] args) {
		circle c=new circle();
		double result=c.area(5);  //3.14*5*5
		System.out.println("Area is: "+result);
	}
	}
