class Solution {
    public int pairSum(ListNode head) {
        ListNode slow=head,fast=head,pre=null,curr=head;
        int ans=0;
        while(fast!=null){
            fast=fast.next.next;
            curr=slow;
            slow=slow.next;
            curr.next=pre;
            pre=curr;
        }
        while(slow!=null){
            ans=Math.max(ans,pre.val+slow.val);
            slow=slow.next;
            pre=pre.next;
        }
        return ans;
    }
}
