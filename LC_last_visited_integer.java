class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> temp=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        int c=0;
        String s="";
        for(int i=0;i<=words.size();i++){
            if(i!=words.size()) s=words.get(i);
            if(i==words.size()||(s.charAt(0)>='0'&&s.charAt(0)<='9')){
                if(c!=0){
                    for(int j=temp.size()-1;j>=0&&c>0;j--){
                        al.add(temp.get(j));
                        c--;
                    }
                    if(c!=0){
                        for(int k=0;k<c;k++) al.add(-1);
                    }
                    c=0;
                }
                if(i!=words.size()) temp.add(Integer.valueOf(s));
            }
            else c++;
        }
        return al;
    }
}
