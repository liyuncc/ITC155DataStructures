import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CountUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(3);
		list.add(5);
		list.add(6);
		
		System.out.println(countUnique(list));
		
		
		
	}
	
	
	public static int countUnique(List<Integer> list) {
	    
		//create a set to store the list of numbers
	    Set<Integer> numbers = new TreeSet<Integer>(list);
	    
	    return numbers.size();
		
	}
		
}
