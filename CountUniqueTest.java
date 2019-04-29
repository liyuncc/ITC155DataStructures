import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class CountUniqueTest {

	
	@Test
	public void testCountUnique() {
		List<Integer> list = new LinkedList<Integer>();
		/*
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		*/
		Set<Integer> numbers = new TreeSet<Integer>(list);
		
		assertEquals(0, numbers.size());
	
	}


}
