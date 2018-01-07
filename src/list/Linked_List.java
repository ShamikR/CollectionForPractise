package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linked_List {

	public static void main(String[] args) {
		
		//methods same as arraylist
		//difference between arraylist and linked list
		// 1 Linked list uses double linked list where arraylist uses dynamic array
		// 2 Data manipulation is faster in linked list .It uses double linked list so bit shifting is required
		 // but data manipulation is slower in arraylist,If any data is removed all bit are shifted in memory
		// 3 arraylist is better for storing and accessing. Linked list is better for manipulating data
		
		
		List <String> LinkdList=new LinkedList<String>();
		
		LinkdList.add("T1");
		LinkdList.add("T1");
		LinkdList.add("T4");
		LinkdList.add("T2");
		LinkdList.add("T9");
		LinkdList.add("T4");
		
		
		System.out.println(LinkdList);

		for(int i=0; i<LinkdList.size();i++ )
			System.out.println(LinkdList.get(i));
		
		
	//Linked List and  can be traveresed backword using ListIterator	
		
		ListIterator it=LinkdList.listIterator();
		
		     while(it.hasNext())
		    	 System.out.println(it.next());
		
			while(it.hasPrevious())
				System.out.println(it.previous());
				
	}

}
