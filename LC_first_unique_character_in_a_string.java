class Solution {
    public int firstUniqChar(String s) {
        int [] a=new int[26];
        int x=0,n=s.length();
        for(int i=0;i<n;i++){
            if(a[s.charAt(i)-'a']==0){
                if(i==n-1) return i;
                a[s.charAt(i)-'a']++;
                for(int j=i+1;j<n;j++){
                    if(s.charAt(i)==s.charAt(j))
                    break;
                    x=j;
                }
                if(x==n-1) return i;
            }
        }
        return -1;
    }
}
