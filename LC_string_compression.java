class Solution {
    public int compress(char[] chars) {
        int ans=1,count=1,c=1,r;
        for(int i=1;i<chars.length;i++)
        if(chars[i]==chars[i-1]) count++;
        else{
            ans++;
            if(count!=1){
                String s=Integer.toString(count);
                for(int j=0;j<s.length();j++){
                    chars[c++]=s.charAt(j);
                    ans++;
                }
            }
            chars[c++]=chars[i];
            count=1;
        }
        if(count!=1){
            String s=Integer.toString(count);
            for(int j=0;j<s.length();j++){
                chars[c++]=s.charAt(j);
                ans++;
            }
        }
        return ans;
    }
}
