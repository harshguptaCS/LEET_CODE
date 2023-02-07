class Solution {
    public int totalFruit(int[] fruits) {
        int a=fruits[0],b=-1,m=0,l=0;
        for(int i=1;i<fruits.length;i++){
            if(fruits[i]==a||fruits[i]==b);
            else if(b==-1)
            b=fruits[i];
            else{
                m=Math.max(m,i-l);
                b=fruits[i];
                a=fruits[i-1];
                for(int j=i-2;j>=0;j--)
                if(fruits[j]!=a){
                    l=j+1;
                    break;
                }
            }
        }
        m=Math.max(m,fruits.length-l);
        return m;
    }
}
