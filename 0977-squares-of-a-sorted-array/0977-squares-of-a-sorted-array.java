class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int k = nums.length - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right]; 
            if ( leftSquare > rightSquare ) {
                arr[k] = leftSquare;
                left++;
            } else {
                arr[k] = rightSquare;
                right--;
            }
            k--;
        }
        return arr;
    }
}