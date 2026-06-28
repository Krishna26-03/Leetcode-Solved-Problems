class Solution {
    public int maxProduct(int[] nums) {
        int minBest = nums[0];
        int maxBest = nums[0];
        int ans = nums[0];
        for( int i = 1; i<nums.length; i++){
            int minValue = nums[i] * minBest;
            int maxValue = nums[i] * maxBest;
            minBest = Math.min(nums[i], Math.min(minValue, maxValue));
            maxBest = Math.max(nums[i], Math.max(minValue, maxValue));
            ans = Math.max(ans, Math.max(maxBest, minBest));
        }
        return ans;
    }
}