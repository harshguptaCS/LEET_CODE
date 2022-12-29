class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l=new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            int x=i,r,fl=1;
            if(x%10==0) continue;
            while(x!=0){
                r=x%10;
                if(r==0){
                    fl=0;
                    break;
                }
                x=x/10;
                if(i%r!=0){
                    fl=0;
                    break;
                }
            }
            if(fl==1) l.add(i);
        }
        return l;
    }
}
