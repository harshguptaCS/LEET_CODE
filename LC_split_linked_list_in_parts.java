class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len=0;
        ListNode temp=head,ans[]=new ListNode[k],prv;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int p=len/k,m=len%k,i=0;
        if(len<k) m=0;
        while(head!=null){
            ans[i]=head;
            for(int j=1;j<p;j++)
            head=head.next;
            if(i<m) head=head.next;
            prv=head;
            head=head.next;
            prv.next=null;
            i++;
        }
        return ans;
    }
}
