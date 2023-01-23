public static Node findMiddle(Node head) 
    {
        //approach 1 
        //Write your code here
        // int length = 0;
        // Node curr = head;

        // while(curr != null){
        //     length += 1;
        //     curr = curr.next;
        // }
        
        // curr = head;
        // int mid = length/2;
        // for(int i = 0; i < mid; i++){
        //     curr = curr.next;
        // }

        //approach - 2
        Node slowPtr = head;
        Node fastPtr = head;
        while(fastPtr.next.next != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        //if(fastPtr.next.next == null) return slowPtr;
        return slowPtr.next;
    }
