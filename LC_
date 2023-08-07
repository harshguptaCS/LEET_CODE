class Solution {
    public Node flatten(Node head) {
        if(head==null) return head;
        harsh(head);
        return head;
    }
    public Node harsh(Node head){
        if(head.next==null&&head.child==null) return head;
        if(head.child!=null){
            Node l=harsh(head.child);
            Node n=head.next;
            head.next=head.child;
            head.child.prev=head;
            head.child=null;
            if(n!=null){
                l.next=n;
                n.prev=l;
            }
        }
        return harsh(head.next);
    }
}
