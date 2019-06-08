import java.util.ArrayList;

public class ListClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list1 = new ArrayList();
		list1.add(18);
		list1.add(27);
		list1.add(93);
		System.out.println(list1);
		list1.remove(1);
		System.out.println(list1);
		
		
		LinkedIntList list = new LinkedIntList();
		list.add(18);
		list.add(27);
		list.add(42);
		list.add(3);
		list.add(-1);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.isSorted());
		
		
		
		
		

	}

}
