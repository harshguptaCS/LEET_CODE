class Solution {
    public int findDuplicate(int[] nums) {
        for (int i=0;i<nums.length;) {
            int n=nums[i];
            if (n == i + 1) i++;
            else if (n == nums[n - 1]) return n;
            else {
                nums[i] = nums[n - 1];
                nums[n - 1] = n;
            }
        }
        return 0;
    }
}
