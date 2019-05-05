
public class WriteNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeNums(12);
	}

	public static void writeNums(int n) {
		
		if(n < 0) {
			
			throw new IllegalArgumentException();
			
		}else if(n == 1) {
			
			System.out.print(1);
			
		}else {
			
			writeNums(n-1);
			System.out.print(", " + n);
			
			
			
			
			
			
		}
	}
}
