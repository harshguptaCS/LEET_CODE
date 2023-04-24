class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head=list1,l=null;
        while(b>=0){
            if(a==1) l=list1;
            list1=list1.next;
            a--;
            b--;
        }
        l.next=list2;
        while(list2.next!=null)
        list2=list2.next;
        list2.next=list1;
        return head;
    }
}
