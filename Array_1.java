package Array;
//example of single dimensional array
public class Array_1 {
	public static void main(String[] args) {
		String [] names= {"Mamta","Ram","Karan","Ajay","Ajith","Tushar"}; //declaring & assigning
	    for(int i=0; i<names.length; i++) {  //for loop for name
	    	System.out.println(names[i]);  //for printing the name
	    }
	    System.out.println();  
	    int [] phone= {123,456,789,955,444,666};  
	    for(int j=0; j<phone.length; j++) {    //for loop for phone number
	    	System.out.println(phone[j]);   //for printing the phone
	    }
	}

}
