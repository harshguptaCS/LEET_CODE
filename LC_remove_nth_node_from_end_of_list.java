class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l1=head,l2=head;
        while(l1!=null){
            l1=l1.next;
            if(n<0) l2=l2.next;
            else n--;
        }
        if(n<0) l2.next=l2.next.next;
        else if(head.next==null) head=null;
        else head=head.next;
        return head;
    }
}
