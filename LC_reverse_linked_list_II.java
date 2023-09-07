class Solution {
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(head==null||head.next==null) return head;
        if(l==r) return head;
        ListNode temp=head,pre=head,k=null,curr=head;;
        int x=0;
        while(x<r){
            x++;
            pre=pre.next;
        }
        x=1;
        while(x<=r){
            if(x<l){
                k=head;
                head=head.next;
            }
            else{
                curr=head;
                head=head.next;
                curr.next=pre;
                pre=curr;
            }
            x++;
        }
        if(l==1) return curr;
        k.next=curr;
        return temp;
    }
}
