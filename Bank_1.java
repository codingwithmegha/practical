package mypackage;
public class Bank_1 {   //main class
public static void main(String[] args) {   //main method
	Bank b=new Bank();   //creating the object of encapsulated Bank class
	b.setAcount_no(377665267543l);   //setting value in the account_number
	b.setName("megha");   //setting value in the name
	b.setEmail("meghatomar@gmail.com");   //setting value in the email
	b.setAmount(30000);   //setting value in the amount
	System.out.println("Account_number is:"+b.getAcount_no());   //getting the value of account_number
	System.out.println("Name is"+b.getName());     //getting the value of name
	System.out.println("E-mail is:"+b.getEmail());     //getting the value of email
	System.out.println("Amount is:"+b.getAmount());    //getting the value of amount
}
}
