class Solution {
    public List<Integer> partitionLabels(String s) {
        int count[]=new int[26],sum=0,l=0;
        for(int i=0;i<s.length();i++)
        count[s.charAt(i)-'a']++;
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)-'a']==0) sum--;
            else{
                sum+=count[s.charAt(i)-'a'];
                count[s.charAt(i)-'a']=0;
                sum--;
            }
            if(sum==0){
                al.add(i-l+1);
                l=i+1;
            }
        }
        return al;
    }
}
