package SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkdHashset {

	public static void main(String[] args) {
		// Linkedhassetmaiantains the insertion order but hashset doesnot maintain
		//everything else is similar to set
		
Set <String> s1= new HashSet<String>();
		
		s1.add("a1");
		s1.add("a12");
		s1.add("a1");
		s1.add("a13");
		s1.add("a01");
		s1.add("a12");
		s1.add("a13");
		System.out.println(s1);

		Set <String> s2= new LinkedHashSet<String>();
		
		s2.add("a1");
		s2.add("a12");
		s2.add("a1");
		s2.add("a13");
		s2.add("a01");
		s2.add("a12");
		s2.add("a13");
		System.out.println(s2);
		
		

	}

}
