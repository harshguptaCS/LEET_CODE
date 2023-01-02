class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> al=new ArrayList<Integer>();
        int i=0,j=0,x=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]>nums2[j]) j++;
            else if(nums1[i]<nums2[j]) i++;
            else{
                if(al.size()==0||al.get(al.size()-1)!=nums1[i]) al.add(nums1[i]);
                i++;
                j++;
            }
        }
        int [] a=new int[al.size()];
        for(int y:al) a[x++]=y;
        return a;
    }
}
