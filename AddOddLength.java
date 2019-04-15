import java.util.*;

public class AddOddLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ian");
		names.add("Sebby");
		names.add("Skye");
		names.add("Claire");
		names.add("Tom");
		names.add("Lucas");
		names.add("Nate");
		names.add("Mia");
		
		System.out.print(removeEvenLength(names));

	}
	
	public static ArrayList<String> removeEvenLength(ArrayList<String> list) {
		ArrayList<String> oddLength = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).length() % 2 != 0) {
				oddLength.add(list.get(i));
			}
		}
		return oddLength;
		
	}

}
