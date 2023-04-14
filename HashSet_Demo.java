package Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSet_Demo {
public static void main(String[] args) {
	//creating handset and adding elements
	HashSet<String>set=new HashSet();  //set 1
	set.add("ram");
	set.add("rima");
	set.add("shyam");
	set.add("ram");
	set.add("ramesh");
	System.out.println("original list:"+set);
	//removing specific element from hash set
	set.remove("ram");
	System.out.println("After invoking remove:"+set);
	HashSet<String>set1=new HashSet(); //set2
	set1.add("pallabi");
	set1.add("rahul");
	System.out.println("new Set:"+set1);
	//remove all the new elements
	set.removeAll(set1);
	//remove all
	set.clear();
	System.out.println("present list:"+set);
}
}
