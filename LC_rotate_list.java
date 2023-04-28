class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head,ans=null;
        int l=1;
        if(head==null) return head;
        while(temp.next!=null){
            temp=temp.next;
            l++;
        }
        k=l-k%l;
        if(k!=0)temp.next=head;
        while(k>0){
            k--;
            if(k==0) {
                ans=head.next;
                head.next=null;
            }
            head=head.next;
        }
        return ans;
    }
}
