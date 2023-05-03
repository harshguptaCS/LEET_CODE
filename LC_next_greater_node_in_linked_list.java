class Solution {
    public int[] nextLargerNodes(ListNode head) {
        harsh(head,0);
        return a;
    }
    int a[];
    public void harsh(ListNode head,int c){
        if(head.next==null){
            a=new int[c+1];
            return;
        }
        else harsh(head.next,c+1);
        ListNode temp=head.next;
        while(temp!=null){
            if(temp.val>head.val){
                a[c]=temp.val;
                break;
            }
            temp=temp.next;
        }
        head.next=temp;
    }
}
