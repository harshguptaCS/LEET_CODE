class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode s=null,l=head,r=head;
        while(head!=null){
            k--;
            if(k==0) s=head;
            if(k<0) l=l.next;
            head=head.next;
        }
        int t=s.val;
        s.val=l.val;
        l.val=t;
        return r;
    }
}
