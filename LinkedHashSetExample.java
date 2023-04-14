package Collection;
//lhs inherit the hashset class & implements the set interface
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSetExample {
//allowing null method
	public static void main(String[] args) {
		Set<String> s=new LinkedHashSet<String>();
		s.add("pen");
		s.add("Pencil");
		s.add("Mouse");
		s.add("Phone");
		s.add(null);
		s.add("AC");
		s.add("Bottle");
		s.add("earsphone");
		s.add("pen");  //not allowing duplicate
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
