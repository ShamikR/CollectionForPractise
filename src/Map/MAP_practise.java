package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MAP_practise {

	public static void main(String[] args) {
		
		

	
		Map<Integer,String> m= new HashMap<Integer,String>();
		
		m.put(1, "T1");
		
		m.put(1, "T2");
		m.put(2, "T5");
		m.put(4, "T6");
		
		System.out.println("one way of print "+m);
		
		 System.out.println("======================================================");
		 
		System.out.println(m.get(4));
		
		 System.out.println("======================================================");
		 
		Set<Integer> kySet=m.keySet();
		 Iterator<Integer> it=kySet.iterator();
		 
		 while(it.hasNext())
		 {
			  Integer k=it.next();
			 System.out.println("printinh using key set==>>Key: "+k+" Value: "+m.get(k));
		 }
	
		 System.out.println("======================================================");
		 
		Set<Entry<Integer, String>> j = m.entrySet();
		
		Iterator<Entry<Integer, String>> it1=j.iterator();
		
		while(it1.hasNext())
			System.out.println("using entry set and iterator "+ it1.next());
		
		 System.out.println("======================================================");
		
		 for( Entry<Integer, String> j2: m.entrySet() )
			 
			 System.out.println("using entry set and for each loop using getkey and getvalue"+"Key :"+j2.getKey()+" value "+j2.getValue());
	
		 System.out.println("======================================================");
		 System.out.println("Program to check occurence of a letter a in a single word");
		 System.out.println("enter a word");
		 
		 
		 Scanner sc=new Scanner(System.in);
		
		 String input=sc.next();
		 
		String[] a =input.split("") ;
		
		Map <String,Integer>CheckString= new HashMap<String,Integer>();
		
		
		
		
		
		for(int j1=1;j1<a.length;j1++)
			
		{
			
		   if(CheckString.containsKey(a[j1]))
			   
			   CheckString.put(a[j1],CheckString.get(a[j1])+1); 
		   
		   else
			   
			   CheckString.put(a[j1], 1);
			   
			   
			
		}
		
		
		System.out.println(CheckString);
		
		 
	}

	
	
}
