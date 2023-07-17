class Solution {
    public int maximalRectangle(char[][] matrix) {
        int mat[][]=new int[matrix.length][matrix[0].length];
        for(int j=0;j<mat[0].length;j++)
        mat[0][j]=matrix[0][j]-'0';
        int ans=harsh(mat[0]);
        for(int i=1;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++)
            if(matrix[i][j]!='0') mat[i][j]=1+mat[i-1][j];
            ans=Math.max(ans,harsh(mat[i]));
        }
        return ans;
	}
    public static int harsh(int arr[]){
        int n=arr.length,max=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.empty()&&arr[st.peek()]>arr[i]){
                int h=arr[st.pop()];
                int l=-1;
                if(!st.empty()) l=st.peek();
                max=Math.max(max,(i-l-1)*h);
            }
            st.push(i);
        }
        while(!st.empty()){
            int h=arr[st.pop()];
            int l=-1;
            if(!st.empty()) l=st.peek();
            max=Math.max(max,(n-l-1)*h);
        }
        return max;
    }
}
