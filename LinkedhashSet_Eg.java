package Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedhashSet_Eg {
public static void main(String[] args) {
	//creating HashSet and Asding elements
	LinkedHashSet<String> lhs=new LinkedHashSet<String>();
	lhs.add("two");
	lhs.add("one");
	lhs.add("three");
	lhs.add("four");
	lhs.add("five");
	System.out.println("original list:"+lhs);
	//removing specific element from the above mentioned list
	System.out.println(lhs.remove("two"));
	System.out.println("updated list:"+lhs);
	//six is not present
	//return false
	System.out.println(lhs.remove("six"));
}
}
