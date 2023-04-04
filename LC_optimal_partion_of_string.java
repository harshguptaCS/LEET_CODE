class Solution {
    public int partitionString(String s) {
        int a[]=new int[26],c=1,x;
        for(char i:s.toCharArray()){
            x=i-'a';
            if(a[x]==c) c++;
            a[x]=c;
        }
        return c;
    }
}
