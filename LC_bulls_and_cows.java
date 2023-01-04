class Solution {
    public String getHint(String secret, String guess) {
        int [] s=new int[10],g=new int[10];
        int a=0,b=0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)!=guess.charAt(i)){
                s[secret.charAt(i)-'0']++;
                g[guess.charAt(i)-'0']++;
            }
            else a++;
        }
        for(int i=0;i<10;i++){
            b+=Math.min(s[i],g[i]);
        }
        return a+"A"+b+"B";
    }
}
