class Solution {
    public int rearrangeCharacters(String s, String target) {
        int a[]=new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++)
        a[s.charAt(i)-'a']++;
        while(true){
            int fl=1;
            for(int i=0;i<target.length();i++){
                a[target.charAt(i)-'a']--;
                if(a[target.charAt(i)-'a']<0){
                    fl=0;
                    break;
                }
            }
            if(fl==0) break;
            ans++;
        }
        return ans;
    }
}
