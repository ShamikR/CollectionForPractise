package AllJavaProgramminginIVW;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {
	
		
		int n1=0;
		int n2=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("How many in first array");
		
		n1=sc.nextInt();
		
		int []ar1 = new int[n1] ;
		
    System.out.println("How many in 2nd array");
		
		n2=sc.nextInt();
		
		
		int []ar2 = new int[n2] ;
		Set<Integer> s1= new HashSet<Integer>();
		
		for(int i1=0;i1<n1;i1++)
			
		{
			System.out.println("enter data first array");
			
			ar1[i1]=sc.nextInt();
			s1.add(ar1[i1]);
			
		}
	
	
		Set<Integer> s2= new HashSet<Integer>();

		for(int i2=0;i2<n2;i2++)
			
		{
			System.out.println("enter data 2nd array");
			
			ar2[i2]=sc.nextInt();
			s2.add(ar2[i2]);
			
		}
	
	
		s1.retainAll(s2);
		
		
		System.out.println(s1);
		
	
	}

}
