public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> backward = null;
		LinkedListNode<Integer> forward = curr;

		while(curr != null){
			forward = curr.next;
			curr.next = backward;
			backward = curr;
			curr = forward;

		}
		return backward;
    }
