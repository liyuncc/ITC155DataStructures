
// Simple first version of LinkedIntList with just a constructor
// and methods for add and toString.

public class LinkedIntList {
    private ListNode front;  // first value in the list

    // post: constructs an empty list
    public LinkedIntList() {
        front = null;
    }

    // post: returns comma-separated, bracketed version of list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }
    
    //return the current number of elements in the list
    public int size() {
    	int count = 0;
    	ListNode current = front;
    	while(current != null) {
    		current = current.next;
    		count++;
    	}
		return count;
    	
    }
    
    //return the value at a given index in the list
    public int get(int index) {
    	return nodeAt(index).data;
    }
    
    //pre: 0 < index < size()
    //return a reference to the node at a given index
	private ListNode nodeAt(int index) {
		ListNode current = front;
		for(int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}

	//insert a value at a specified index
	public void add(int index, int value) {
		if(index == 0) {
			front = new ListNode(value, front);
		}else {
			ListNode current = nodeAt(index - 1);
			current.next = new ListNode(value, current.next);
		}
	}
	
	//pre: 0 < index < size()
    //post: remove value at the given index
	public void remove(int index) {
		if(index == 0) {
			front = front.next;
		}else {
			ListNode current = nodeAt(index - 1);
			current.next = current.next.next;
		}
	}
	
	public boolean isSorted() {
		//if it's an empty list, return true
		//while the list is not empty
			//if the next is smaller than the current, return false
			//else, return true
		if(front == null) {
			return true;
		}
		
		ListNode current = front;
		ListNode next = current.next;
		
		while(next != null) {
			if(next.data - current.data < 0) {
				return false;
			}
			
			current = next;
			next = next.next;
			
		}
		return true;
	}
	
}

