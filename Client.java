
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// construct and print list
        int[] data = {5, 19, 0, 2, 4, 0, 13, 85, -8, 0, 23, 0, 0, 0, 0, 0};
        ArrayIntList list = new ArrayIntList();
        for (int n : data) {
            list.add(n);
        }
        System.out.println("list before = " + list);

        //ArrayIntListIterator i = list.iterator();
        
        /*int product = 1;
        while(i.hasNext()){
        	int n = i.next();
        	if(n == 0) {
        		i.remove();
        	}else{
        		product *= n;
        	}
        }
        */
        list.replaceAll(0, 500);
        
        System.out.println("list now: " + list);
        
        //System.out.println("product: " + product);

	}

}
