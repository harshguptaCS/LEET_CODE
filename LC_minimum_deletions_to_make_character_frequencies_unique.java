class Solution {
    public int minDeletions(String s) {
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
        a[s.charAt(i)-'a']++;
        Arrays.sort(a);
        int x=0;
        for(int i=0;i<26;i++){
            if(a[i]==0) continue;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    a[i]--;
                    x++;
                    i=0;
                }
            }
        }
        return x;
    }
}
