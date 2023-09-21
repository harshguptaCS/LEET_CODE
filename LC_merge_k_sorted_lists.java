class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<ListNode>(){
            public int compare(ListNode l1,ListNode l2){
                return l1.val-l2.val;
            }
        });
        for(ListNode ll:lists){
            if(ll!=null) pq.add(ll);
        }
        ListNode dummy=new ListNode(),temp=dummy;
        while(!pq.isEmpty()){
            ListNode rv=pq.poll();
            dummy.next=rv;
            dummy=dummy.next;
            if(rv.next!=null)
            pq.add(rv.next);
        }
        return temp.next;
    }
}
