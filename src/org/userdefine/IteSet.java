package org.userdefine;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteSet {

	public static void main(String[] args) {
		Set<String> s=new LinkedHashSet<>();
		s.add("100");
		s.add("200");
		s.add("300");
		for (String i : s) {
			System.out.println(i);
		}
		System.out.println("******for loops iteration*********");
		for(int i=0; i<s.size(); i++) {
			System.out.println(i);
		}
		
		Iterator  is=s.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
		
		Map<Integer, String> m=new LinkedHashMap<Integer, String>();
		m.put(1,"Thaniga");
		m.put(2, "Diya");
		m.put(3, "Nathiya");
		
		System.out.println(m);
		
		 Set<Entry<Integer, String>> entrySet = m.entrySet();
		 for (Entry<Integer, String> entry : entrySet) {
			 System.out.println("Print entry set: "+entry);
			 System.out.println("Print key: "+entry.getKey());
			 System.out.println("Print value: "+ entry.getValue());
			 
		}
	}

}
