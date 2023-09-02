class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> set = new HashSet<>();
        char ch[]=s.toCharArray();
        for(String x:dictionary)
        set.add(x);
        int count[]=new int[s.length()];
        for(int i=ch.length-1;i>=0;i--){
            int min=51;
            StringBuilder str=new StringBuilder();
            for(int j=i;j<ch.length;j++){
                int co=0;
                str.append(ch[j]);
                if(!set.contains(str.toString())) co=str.length();
                if(j!=s.length()-1) co+=count[j+1];
                min=Math.min(min,co);
            }
            count[i]=min;
        }
        return count[0];
    }
}
