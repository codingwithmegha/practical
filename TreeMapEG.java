package Collection;

import java.util.HashMap;
import java.util.Map;

public class TreeMapEG {


public static void main(String[] args) {
	// creating map
	HashMap<Integer,String> map = new HashMap<Integer,String>();
map.put(101, "mango");
map.put(102, "orange");
map.put(103, "Banana");

map.put(106, "Apple");
map.put(109, "Lichi");

map.put(107, null);
System.out.println(map);
	map.putIfAbsent(107, "CustardApple");
	map.putIfAbsent(101, "Watermelon");
	System.out.println("------------------------------");
	for(Map.Entry m: map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	map.remove(103);
	System.out.println("---------------------------------");
System.out.println("after Removel");

for(Map.Entry m: map.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());}
	


}}
