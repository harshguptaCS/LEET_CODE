class Solution {
    public ListNode removeNodes(ListNode head) {
        reverse(head,null);
        if(head.val==0) return head.next;
        return head;
    }
    int m=0;
    public void reverse(ListNode head,ListNode prev){
        if(head.next!=null) reverse(head.next,head);
        if(head.val<m){
            if(prev!=null)prev.next=head.next;
            else head.val=0;
        }
        m=Math.max(m,head.val);
    }
}
