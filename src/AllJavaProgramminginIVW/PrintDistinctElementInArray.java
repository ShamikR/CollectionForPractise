package AllJavaProgramminginIVW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrintDistinctElementInArray {

	public static void main(String[] args) {
	
		//print distinct element in array
		
		int n = 0;
		
		
		
		System.out.println("Enter how many number you will provide");
		
		Scanner sc= new Scanner(System.in);
		
		n=sc.nextInt();
		
		int []ar=new int[n] ;
		
		for(int i=0;i<n;i++)

		{
			System.out.println("Enter Value");
					
		    ar[i]=sc.nextInt();
		}
	
	
		Set <Integer> s= new HashSet<Integer>();
		
		for(int j=0;j<ar.length;j++)
			
			s.add(ar[j]);
		
		System.out.println(s);
		
	
	
	
	}

}
