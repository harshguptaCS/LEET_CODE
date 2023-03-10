class Solution {
    public int minimumSum(int num) {
        int c=3;
        int a[]=new int[4];
        while(num>0){
            a[c--]=num%10;
            num/=10;
        }
        Arrays.sort(a);
        return (a[0]+a[1])*10+a[2]+a[3];
    }
}
