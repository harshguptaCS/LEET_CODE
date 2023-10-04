class MyHashMap {
    public class Node{
        int key;
        int value;
        Node next;
    }
    ArrayList<Node> ll;
    int size=0;
    public MyHashMap() {
        ll=new ArrayList<>();
        for(int i=0;i<4;i++){
            ll.add(null);
        }
    }
    public int hashfun(int key){
        int bn=key%ll.size();
        if(bn<0){
            bn=bn+ll.size();
        }
        return bn;
    }
    public void put(int key, int value) {
        int idx=hashfun(key);
        Node temp=ll.get(idx);
        while(temp!=null){
            if(temp.key==key){
                temp.value=value;
                return;
            }
            temp=temp.next;
        }
        size++;
        temp=ll.get(idx);
        Node nn=new Node();
        nn.key=key;
        nn.value=value;
        nn.next=temp;
        ll.set(idx,nn);
        double thf=2.0;
        double lf=1.0*size/ll.size();
        if(lf>thf){
            rehashing();
        }
    }
    
    public int get(int key) {
        int idx=hashfun(key);
        Node temp=ll.get(idx);
        while(temp!=null){
            if(temp.key==key){
                return temp.value;
            }
            temp=temp.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int idx=hashfun(key);
        Node curr=ll.get(idx),prev=null;
        while(curr!=null){
            if(curr.key==key){
                break;
            }
            prev=curr;
            curr=curr.next;
        }
        if(curr==null) return;
        if(prev==null) ll.set(idx,curr.next);
        else prev.next=curr.next;
        size--;
    }
    public void rehashing(){
        ArrayList<Node> new_list=new ArrayList<>();
        for(int i=0;i<2*ll.size();i++){
            new_list.add(null);
        }
        ArrayList<Node> oba=ll;
        ll=new_list;
        for(Node temp:oba){
            while(temp!=null){
                put(temp.key,temp.value);
                temp=temp.next;
            }
        }
    }
}
