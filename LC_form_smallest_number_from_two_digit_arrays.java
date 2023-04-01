class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i:nums1)
            for(int j:nums2){
                if(i==j) return i;
                if(j>i) break;
            }
        if(nums1[0]<nums2[0]) return nums1[0]*10+nums2[0];
        return nums2[0]*10+nums1[0];
    }
}
