class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode ans=head;
        ListNode temp=head;
        while(temp!=null&&temp.next!=null){
            ans=ans.next;
            temp=temp.next.next;
        }
        return ans;
    }
}
