package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
public static void main(String[] args) {
	List<String> all= new ArrayList<String>();
all.add("Megha");
all.add("Sadaf");
all.add("Liza");
all.add("Ram");
all.add("David");
all.add("Maria");
String element=all.get(2);//get() method
System.out.println("Get index: "+element);
System.out.println("Array list is: "+all.isEmpty());//isEmpty
String element1=all.remove(3);//remove()
System.out.println("Remove Index: "+element1);
System.out.println("Traversing using for loop");
for(int i=0;i<all.size();i++) {
	System.out.println(all.get(i));
}
}
}
