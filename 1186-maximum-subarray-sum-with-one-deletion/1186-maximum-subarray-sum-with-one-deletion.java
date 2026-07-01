class Solution {
    public int maximumSum(int[] arr) {
        int noDelete = arr[0];
        int delete = Integer.MAX_VALUE;
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            int prevNoDelete = noDelete;
            int prevDelete = delete;
            noDelete = Math.max(arr[i], prevNoDelete + arr[i]);
            if(prevDelete == Integer.MAX_VALUE){
                delete = prevNoDelete;
            }else{
                delete = Math.max( prevNoDelete, prevDelete + arr[i]);
            }
            ans = Math.max(ans, Math.max(delete, noDelete));
        }
        return ans;
    }
}