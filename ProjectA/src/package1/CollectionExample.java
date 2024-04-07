package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionExample {
	
	public static void main(String[] args) {
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(12, "Selenium");
		hm.put(338,"Automation");
		hm.put(45, "API");
		hm.put(56,"Testing");
		hm.put(566,"Devops");
		hm.put(12,"Deepak");
		
		Set<Integer> allKeys=hm.keySet();
		for(Integer i : allKeys)
		{
			System.out.println("Key name is "+i);
			System.out.println("value is "+hm.get(i));
		}
	}

}
