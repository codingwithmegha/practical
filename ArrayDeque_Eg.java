package Collection;
import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDeque_Eg {
public static void main(String[] args) {
	Deque<String> dq= new ArrayDeque<String>();
	dq.add("Hasan");
	dq.add("Sana");
	dq.add("Amir");
	dq.add("Barira");
	dq.add("Kajol");
	dq.add("Aashi");
//dq.add(null);   //null not allowed 
System.out.println(dq);
dq.addFirst("Shree");
dq.addLast("Riya");
System.out.println("New List");
for(String s1:dq) {
System.out.println(s1);
}
dq.removeFirst();
dq.removeLast();
System.out.println("new list after removal");
for(String s2: dq) {
	System.out.println(s2);
}
}
}
