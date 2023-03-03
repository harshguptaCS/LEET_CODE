class Solution {
    public int minPartitions(String n) {
        int m=0;
        char ch[]=n.toCharArray();
        for(char c:ch)
        m=Math.max(m,c-'0');
        return m;
    }
}
