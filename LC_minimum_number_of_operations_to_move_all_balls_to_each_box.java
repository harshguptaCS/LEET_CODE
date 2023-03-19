class Solution {
    public int[] minOperations(String boxes) {
        int L=0,R=0,l=0,r=0,c=0;
        char arr[]=boxes.toCharArray();
        for(int i=0;i<arr.length;i++)
        if(arr[i]=='1'){
            R+=i+1;
            r++;
        }
        int ans[]=new int[arr.length];
        for(char ch:arr){
            L+=l;
            R-=r;
            ans[c++]=L+R;
            l+=ch-'0';
            r-=ch-'0';
        }
        return ans;
    }
}
