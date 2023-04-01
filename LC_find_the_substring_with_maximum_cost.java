class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int a[]=new int[26],l=0,sum=0,ans=0;
        for(int i=0;i<26;i++)
        a[i]=i+1;
        for(int i=0;i<chars.length();i++)
        a[chars.charAt(i)-'a']=vals[i];
        for(int i=0;i<s.length();i++){
            sum+=a[s.charAt(i)-'a'];
            while(sum<0){
                sum-=a[s.charAt(l)-'a'];
                l++;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
