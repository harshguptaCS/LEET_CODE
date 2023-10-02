class Solution {
    public boolean winnerOfGame(String colors) {
        int na=0,ca=0,nb=0,cb=0;
        for(char c:colors.toCharArray()){
            if(c=='A'){
                nb=0;
                na++;
                if(na>2) ca++;
            }
            else{
                na=0;
                nb++;
                if(nb>2) cb++;
            }
        }
        return ca>cb;
    }
}
