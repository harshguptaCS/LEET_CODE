class Solution {
    public int countCharacters(String[] words, String chars) {
        int arr[]=new int[26];
        for(char c:chars.toCharArray()) arr[c-'a']++;
        int ans=0;
        for(String s:words){
            if(harsh(s,arr)) ans+=s.length();
        }
        return ans;
    }
    public boolean harsh(String s,int arr[]){
        int ar[]=new int[26];
        for(char c:s.toCharArray()){
            int x=c-'a';
            ar[x]++;
            if(ar[x]>arr[x]) return false;
        }
        return true;
    }
}
