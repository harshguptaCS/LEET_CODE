class Solution {
    public boolean squareIsWhite(String coordinates) {
        if((coordinates.charAt(0)-'a'+1)%2==1&&(coordinates.charAt(1)-'0')%2==0) return true;
        else if((coordinates.charAt(0)-'a'+1)%2==0&&(coordinates.charAt(1)-'0')%2==1) return true;
        else return false;
    }
}
