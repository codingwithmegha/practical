package String;
public class MutableEgString {
	public static void my() {
		 //string buffer
		StringBuffer s=new StringBuffer("Hello");  //obj of string buffer
		s.append("World");
		System.out.println("String is: "+s);//hello world
		s.insert(2, "Riya");  //(int off set, string s)
		System.out.println("Insert is: "+s); //HeRiyallo World
		s.replace(1, 3, "java"); //(beginWith, endsWith, string s)
		System.out.println("Replace is :"+s);  //Hjavaiyalloworld
		System.out.println("capicaty is :"+s.capacity()); //String builder
		StringBuilder s1=new StringBuilder("world");
		s1.replace(1, 3, "java");  //wjavald
		System.out.println("replace is :"+s1);
		s1.delete(1,3);    //wvald
		System.out.println("delete is: "+s1); 
		s1.reverse();
		System.out.println("reverse is :"+s1);
	}
    public static void main(String[] args) {
		my();
	} 
}
