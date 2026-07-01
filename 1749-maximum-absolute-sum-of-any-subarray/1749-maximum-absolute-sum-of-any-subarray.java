class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int ans = Math.abs(nums[0]);
        for(int i = 1; i< nums.length; i++){
            maxSum = Math.max(nums[i], maxSum + nums[i]);
            minSum = Math.min(nums[i], minSum + nums[i]);
            ans = Math.max(ans, Math.max( maxSum, Math.abs(minSum)));
        }
        return ans;
    }
}