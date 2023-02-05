class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> al=new ArrayList<>();
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<p.length();i++){
            a[p.charAt(i)-'a']++;
        }
        int sum=0,l=0;
        for(int i=0;i<s.length();i++){
            if(sum==p.length()) al.add(l);
            b[s.charAt(i)-'a']++;
            sum++;
            if(b[s.charAt(i)-'a']>a[s.charAt(i)-'a']){
                int in=i;
                for(int j=l;j<=i;j++){
                    b[s.charAt(j)-'a']--;
                    sum--;
                    if(s.charAt(j)==s.charAt(i)){
                        in =j;
                        break;
                    }
                }
                l=in+1;
            }
        }
        if(sum==p.length()) al.add(l);
        return al;
    }
}
