class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char arr[]=new char[26];
            for(char ch:s.toCharArray()) arr[ch-'a']++;
            String x=String.valueOf(arr);
            map.putIfAbsent(x,new ArrayList<>());
            map.get(x).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
