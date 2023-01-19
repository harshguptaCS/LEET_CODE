class Solution {
    public int trap(int[] height) {
        int []left=new int[height.length];
		int []right=new int[height.length];
		int s=0,n=height.length,m1=height[0],m2=height[n-1];
		for(int i=0;i<n;i++){
		    m1=Math.max(m1,height[i]);
		    m2=Math.max(m2,height[n-1-i]);
		    left[i]=m1;
		    right[n-1-i]=m2;
		}
		for(int i=0;i<n;i++){
		    s+=Math.min(left[i],right[i])-height[i];
		}
		return s;
    }
}
