class Solution {
    public int[] asteroidCollision(int[] a) {
        List<Integer> al =new ArrayList<>();
        for(int i:a){
            if(al.size()==0||i>0) al.add(i);
            else harsh(al,i);
        }
        int ans[]=new int[al.size()],c=0;
        for(int x:al)
        ans[c++]=x;
        return ans;
    }
    public void harsh(List<Integer> al,int x){
        if(al.size()==0||al.get(al.size()-1)<0){
            al.add(x);
            return;
        }
        if(al.get(al.size()-1)==x*-1)
        al.remove(al.size()-1);
        else if(al.get(al.size()-1)<x*-1){
            al.remove(al.size()-1);
            harsh(al,x);
        }
    }
}
