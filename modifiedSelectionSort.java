import java.util.Arrays;

public class modifiedSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1, 3, -2, 50, 32};
		System.out.println(Arrays.toString(numbers));
				
		selectionSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	//modified selection sort: selects the largest element of an array and moves it to the end of the array
	//post: array is in sorted order
	
	public static void selectionSort(int[] list) {
		//scan each element using a for loop
		for(int i = list.length - 1; i > 0 ; i--) {
			
			//find the largest element
			int largest = i; //i as a starting point
			
			for(int j = 0; j < i; j++) { //j is next one
				if(list[j] > list[largest]) { //if value of [j] is bigger than [largest], j is assigned to the largest
					largest = j;
				}
			}
			
			//swap the [i] with [largest]
			swap(list, i, largest); 
			
		}
		
	}
	
	
	//swap list[i] with list[largest]
	public static void swap(int[] list, int i, int largest) {
		int temp = list[i];
		list[i] = list[largest];
		list[largest] = temp;
		
		
	}

}
