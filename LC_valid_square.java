class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        if(equal(p1,p2)||equal(p1,p3)||equal(p1,p4)||equal(p3,p2)||equal(p4,p2)||equal(p3,p4)) return false;
        int a,b,c,d,e,f;
        a=(p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]);
        b=(p1[0]-p3[0])*(p1[0]-p3[0])+(p1[1]-p3[1])*(p1[1]-p3[1]);
        c=(p1[0]-p4[0])*(p1[0]-p4[0])+(p1[1]-p4[1])*(p1[1]-p4[1]);
        d=(p2[0]-p3[0])*(p2[0]-p3[0])+(p2[1]-p3[1])*(p2[1]-p3[1]);
        e=(p2[0]-p4[0])*(p2[0]-p4[0])+(p2[1]-p4[1])*(p2[1]-p4[1]);
        f=(p3[0]-p4[0])*(p3[0]-p4[0])+(p3[1]-p4[1])*(p3[1]-p4[1]);
        if((a==b&&b==c)||(a==d&&d==e)||(b==d&&d==f)||(c==e&&e==f)) return false;
        if(!((a==b||a==c||b==c)&&(a==d||a==e||d==e)&&(b==d||b==f||d==f)&&(c==e||c==f||e==f))) return false;
        if(!((a+b==c||a+c==b||b+c==a)&&((a+d==e||a+e==d||d+e==a))&&(b+d==f||b+f==d||d+f==b)&&(c+e==f||c+f==e||e+f==c))) return false;
        return true;
    }
    public boolean equal(int p1[],int p2[]){
        return (p1[0]==p2[0])&&(p1[1]==p2[1]);
    }
}
