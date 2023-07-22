public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA,l2=headB;
        int x=0,y=0;
        while(l1!=null){
            l1=l1.next;
            x++;
        }
        while(l2!=null){
            l2=l2.next;
            y++;
        }
        while(x>y){
            headA=headA.next;
            x--;
        }
        while(x<y){
            headB=headB.next;
            y--;
        }
        while(headA!=null&&headB!=null){
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}
