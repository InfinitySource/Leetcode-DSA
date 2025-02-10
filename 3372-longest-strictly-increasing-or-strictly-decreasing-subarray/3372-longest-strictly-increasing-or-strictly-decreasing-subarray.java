class Solution {

    public int longestMonotonicSubarray(int[] nums) {

        int increase = 1;
        int decrease = 1;
        int longestSubArray = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                increase++;
                decrease = 1;
            } else if (nums[i] < nums[i - 1]) {
                decrease++;
                increase = 1;
            } else {
                increase = 1;
                decrease = 1;
            }
            longestSubArray = Math.max(longestSubArray, Math.max(increase, decrease));
        }
        return longestSubArray;

    }
}