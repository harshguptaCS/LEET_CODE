class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c=0;
        ListNode ans=new ListNode(),temp=ans;
        while(l1!=null||l2!=null||c==1){
            int a=0,b=0;
            if(l1!=null){
                a=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                b=l2.val;
                l2=l2.next;
            }
            temp.val=(a+b+c)%10;
            if(a+b+c>9)c=1;
            else c=0;
            if(l1==null&&l2==null&&c==0) break;
            ListNode i=new ListNode();
            temp.next=i;
            temp=i;
        }
        return ans;
    }
}
