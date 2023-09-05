class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            map.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        temp=head;
        while(head!=null){
            map.get(head).next=map.get(head.next);
            map.get(head).random=map.get(head.random);
            head=head.next;
        }
        return map.get(temp);
    }
}
