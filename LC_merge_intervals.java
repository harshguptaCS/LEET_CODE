class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> al=new ArrayList<>();
        int l=0,c=0,mx=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>mx){
                al.add(new int[]{intervals[l][0],mx});
                l=i;
            }
            mx=Math.max(mx,intervals[i][1]);
        }
        al.add(new int[]{intervals[l][0],mx});
        int ans[][]=new int[al.size()][2];
        for(int[] x:al) ans[c++]=x;
        return ans;
    }
}
