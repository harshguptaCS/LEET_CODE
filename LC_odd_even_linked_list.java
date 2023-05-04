class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode odd=head,even=head.next,ans=head,ans2=even;
        int c=1;
        head=head.next.next;
        while(head!=null){
            if(c%2==1){
                odd.next=head;
                odd=head;
            }
            else{
                even.next=head;
                even=head;
            }
            head=head.next;
            c++;
        }
        even.next=null;
        odd.next=ans2;
        return ans;
    }
}
