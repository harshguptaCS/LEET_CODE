class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode temp=head.next,f,s,p=null;
        while(head!=null&&head.next!=null){
            f=head;
            s=head.next;
            head=head.next.next;
            f.next=head;
            s.next=f;
            if(p!=null) p.next=s;
            p=f;
        }
        return temp;
    }
}
