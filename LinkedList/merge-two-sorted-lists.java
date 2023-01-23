class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode();
        ListNode dummyNode = newHead;
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                dummyNode.next = list1;
                list1 = list1.next;
            }
            else{
                dummyNode.next = list2;
                list2 = list2.next;
            }
            dummyNode = dummyNode.next;
        }
        while(list1 != null){
            dummyNode.next = list1;
                list1 = list1.next;
                dummyNode = dummyNode.next;
        }

        while(list2 != null){
            dummyNode.next = list2;
                list2 = list2.next;
                dummyNode = dummyNode.next;
        }
        return newHead.next;
    }
}
