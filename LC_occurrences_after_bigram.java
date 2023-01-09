class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> l=new ArrayList<>();
        String[] s=text.split(" ");
        for(int i=0;i<s.length-2;i++){
            if(first.equals(s[i])&&second.equals(s[i+1])) l.add(s[i+2]);
        }
        return l.toArray(new String[0]);
    }
}
