class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode temp=head,curr=head,prev=null;
        while(head!=null&&head.next!=null){
            prev=curr;
            curr=curr.next;
            head=head.next.next;
        }
        prev.next=prev.next.next;
        return temp;
    }
}
