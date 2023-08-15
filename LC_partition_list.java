class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smr=null,gtr=null,gs=null,ss=null;
        while(head!=null){
            if(head.val>=x){
                if(gtr==null) gs=head;
                else gtr.next=head;
                gtr=head;
            }
            else{
                if(smr==null) ss=head;
                else smr.next=head;
                smr=head;
            }
            head=head.next;
        }
        if(ss==null) return gs;
        if(gs==null) return ss;
        else{
            smr.next=gs;
            gtr.next=null;
        }
        return ss;
    }
}
