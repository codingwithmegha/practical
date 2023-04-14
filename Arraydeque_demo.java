package Collection;
import java.util.ArrayDeque;
import java.util.Deque;
public class Arraydeque_demo {
public static void main(String[] args) {
	//creating & adding 
	Deque<String> deque=new ArrayDeque<String>();
	deque.add("pallabi");
	deque.add("subhrajit");
	deque.add("mamta");
	deque.add("monami");
	deque.offerFirst("Anju");
	System.out.println("After offer first: ");
	//traversing
	for(String str:deque) {
		System.out.println(str);
		deque.offerLast("Monalisa");
		System.out.println("After offer last");
		//transversing
		for(String str1: deque) {  
			System.out.println(str1);
		}
		//deque.peek()  & deque.peekFirst same as peek()
		System.out.println("peek:"+deque.peek());
		System.out.println("peek first:"+deque.peekLast());
		System.out.println("poll last:"+deque.pollLast());
		System.out.println("after poll");
		for(String str2:deque) {
			System.out.println(str2);
		}
		}
}
}
