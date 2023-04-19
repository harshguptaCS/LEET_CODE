class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null,curr=head;
        while(head!=null){
            curr=head;
            head=head.next;
            curr.next=pre;
            pre=curr;
        }
        return curr;
    }
}
