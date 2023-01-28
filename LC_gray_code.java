class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> l=new ArrayList<>();
        l.add(0);
        l.add(1);
        harsh(l,n,2);
        return l;
    }
    public void harsh(List<Integer> l,int n,int y){
        if(n==1) return;
        for(int j=l.size()-1;j>=0;j--)
        l.add(l.get(j)+y);
        harsh(l,n-1,y*2);
    }
}
