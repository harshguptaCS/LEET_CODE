class Solution {
    public int[] findArray(int[] pref) {
        int a=pref[0],b;
        for(int i=1;i<pref.length;i++){
            b=a;
            a=pref[i];
            pref[i]^=b;
        }
        return pref;
    }
}
