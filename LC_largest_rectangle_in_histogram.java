class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length,max=0;
        Stack<Integer> st=new Stack<>();
		for(int i=0;i<n;i++){
		    while(!st.empty()&&heights[st.peek()]>heights[i]){
		        int h=heights[st.pop()];
		        int l=-1;
		        if(!st.empty()) l=st.peek();
		        max=Math.max(max,(i-l-1)*h);
		    }
		    st.push(i);
		}
		while(!st.empty()){
		    int h=heights[st.pop()];
            int l=-1;
            if(!st.empty()) l=st.peek();
            max=Math.max(max,(n-l-1)*h);
		}
        return max;
    }
}
