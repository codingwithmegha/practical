package Super_keyword;
class Batch{  //parent class
	//parent class property (data member/variable)
	int id;
	String name;
	double fees;
	//parent class cons
	Batch(int id,String name,double fees){
		this.id=id;
		this.name=name;
		this.fees=fees;
	}
}
class Batchmember extends Batch{
	long phone_no;  //child class property
	Batchmember(int id,String name,double fees,long phone_no){  //child class cons
		super(id,name,fees);  //reusing parent cons
	    this.phone_no=phone_no;
	}
	void show() {  //child class method
		System.out.println(id+" "+name+" "+fees+" "+phone_no);
	}
}
public class Super4 {
public static void main(String[] args) {
	Batchmember ob=new Batchmember(1,"Megha",1500.00,873476);
	ob.show();
}
}
