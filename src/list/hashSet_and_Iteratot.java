package list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class hashSet_and_Iteratot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// No insertion order is maintained
		//No duplicate store
		//removeall,addall,containsall,contains,retainsall are same as list
		//retainall compares two set and keeps the commons
		Set <String> s1= new HashSet<String>();
		
		s1.add("a1");
		s1.add("a12");
		s1.add("a1");
		s1.add("a13");
		s1.add("a01");
		s1.add("a12");
		s1.add("a13");
		System.out.println(s1);
		
Set <Integer> s2= new HashSet<Integer>();
		
		s2.add(10);
		s2.add(11);
		s2.add(02);
		s2.add(20);
		s2.add(15);
		s2.add(11);
		s2.add(111);
		System.out.println(s2);
		
		Iterator <Integer> it=s2.iterator();
		
		while(it.hasNext())
			
		System.out.println(it.next());	
		
		
Set <Integer> s3= new HashSet<Integer>();
		
		s3.add(10);
		s3.add(11);
		s3.add(102);
		s3.add(20);
		s3.add(15);
		s3.add(11);
		System.out.println(s3)	;
		
		s2.retainAll(s3);
		System.out.println(s2);
		
		


	}

}
