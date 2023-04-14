package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueue_Eg { 
public static void main(String[] args) {
PriorityQueue<String> queue= new PriorityQueue<String>();
queue.add("Hasan");
queue.add("Sana");
queue.add("Amir");
queue.add("Barira");
queue.add("Kajol");
queue.add("Aashi");
//its work in alphabetic form
System.out.println(" to show the first word Head: "+queue.element());
System.out.println("Queue: "+queue);
System.out.println("Head: "+queue.peek());
System.out.println("Queue: "+queue);
System.out.println("Iterating the elements:");
Iterator itr=queue.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());	
}
System.out.println("Head: "+queue.poll());
System.out.println("Queue: "+queue);
System.out.println("Head: "+queue.remove());
System.out.println("Queue: "+queue);
System.out.println("After removing");
Iterator<String> itr1=queue.iterator();
while(itr1.hasNext()) {
System.out.println(itr1.next());	
}
}
}


