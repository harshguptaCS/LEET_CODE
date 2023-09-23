class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)-> a.length()-b.length());
        Map<String,Integer> map=new HashMap<>();
        int ans=0;
        for(String str:words){
            int mx=0;
            for(int i=0;i<str.length();i++){
                StringBuilder sb=new StringBuilder(str);
                sb.deleteCharAt(i);
                mx=Math.max(mx,map.getOrDefault(sb.toString(),0)+1);
            }
            map.put(str,mx);
            ans=Math.max(ans,mx);
        }
        return ans;
    }
}
