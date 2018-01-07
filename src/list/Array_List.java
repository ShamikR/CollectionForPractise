package list;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Array_List {

	public static void main(String[] args) {
		
		//Maintain Insertion Order
		//Can keep duplicate value
		// method learn- add,addall,get,containsall,retainall,size
		// using iterator we can move forward ,using list iterator we can move backword
		
	List <String> Ar_list= new ArrayList<String>();
	
	
	Ar_list.add("test1");
	Ar_list.add("test2");
	Ar_list.add("test1");
	Ar_list.add("test2");
	Ar_list.add("test5");
	Ar_list.add("test4");
	
	System.out.println(Ar_list);
	
	
	
	Ar_list.add(3, "Added By Index");
	
	for(int i=0;i<Ar_list.size();i++)
		
		System.out.println("print using get "+Ar_list.get(i));
	
	
List <String> Ar_list2= new ArrayList<String>();
	
	
	Ar_list2.add("test12");
	Ar_list2.add("test2");
	Ar_list2.add("test1");
	Ar_list2.add("test2");
	Ar_list2.add("test5");
	Ar_list2.add("test42");
	
	System.out.println("Print ar-list2"+Ar_list2);
	
	Ar_list.retainAll(Ar_list2) ;
	
	System.out.println("Ar_list=>Printing after retaining all"+Ar_list);
	
	System.out.println("Contains All before adding all " +Ar_list.containsAll(Ar_list2)) ;
	
	Ar_list.addAll(Ar_list2);
	
	System.out.println("Ar_list=>Printing after addingall "+Ar_list);
	
	System.out.println("Contains All after adding all"+Ar_list.containsAll(Ar_list2)) ;
	
	System.out.println("Contains "+Ar_list.contains("gg")) ;
	
	
	ListIterator<String> it=Ar_list2.listIterator();
	
	while(it.hasNext())
		System.out.println(it.next());
	
	while(it.hasPrevious())
		System.out.println("Ulta "+it.previous());     
	}

}
