package AllJavaProgramminginIVW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PrintOccurenceOfLetterInWord {

	public static void main(String[] args) {
		
		
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
