import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<String, String>();
		map.put("big", "cat");
		map.put("small", "dog");
		map.put("chubby", "cat");
		
		System.out.println(isUnique(map));
		
	}
	
	//returns true if no two keys map to the same value
	public static boolean isUnique(Map<String, String> map) {
		
		//create a hashset to store the values
		Set<String> set = new HashSet<String>(map.values());
		
		if(set.size() != map.size()) {
			return false;
		}

		return true;
		
	}

}
