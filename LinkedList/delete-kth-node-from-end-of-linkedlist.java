public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int n) {
		
		// Write your code here.

		if(head == null || n == 0) return head;

		LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> temp = head;

		while(n > 0){	
			temp = temp.next;
			n -= 1;
		}

		if(temp == null){
			return head.next;
		}
		while(temp.next != null){
			curr = curr.next;
			temp = temp.next;
		}

        curr.next = curr.next.next;

        return head;
	}
