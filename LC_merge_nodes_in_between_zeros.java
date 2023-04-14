class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode t=new ListNode(0),ans=t;
        while(head!=null){
            if(head.val!=0) t.val=t.val+head.val;
            else if(head.next!=null){
                t.next=new ListNode(0);
                t=t.next;
            }
            head=head.next;
        }
        return ans.next;
    }
}
