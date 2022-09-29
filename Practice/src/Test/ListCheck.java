package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ListCheck {
	
	public static void main(String[] args) {
		
		//when we using list for  duplication
	ArrayList list = new ArrayList();
	list.add("a");
	list.add("b");
	list.add("b");
	list.add("c");
	list.add("c");
	list.add("c");
	
	//when we using set for avoid duplication
		Set<String> set=new HashSet<String>();
	Set set2=new HashSet();
	set.add("a");
	set.add("a");
	set2.add(1);
	System.out.println(list);
	System.out.println("After Using Set");
	System.out.println(set);
	//when we using HashMap for two parameters at one time
Map<String,Integer> hm = new HashMap<String, Integer>();
hm.put("a", 100);
hm.put("b", 200);
hm.put("c", 300);
hm.put("d", 400);
hm.put("a", 200);//duplicate key not allowed
hm.put("e", 200);//Duplicate Values allowed
hm.get("a");

System.out.println(hm);

	
	

}
}

