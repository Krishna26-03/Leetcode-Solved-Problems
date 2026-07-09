class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for ( int candy : candies ){
            max = Math.max(max, candy);
        }
        ArrayList<Boolean> result = new ArrayList<Boolean>(5);
        for ( int i = 0; i < candies.length; i++ ) {
            result.add(candies[i] + extraCandies >= max);  
        }
        return result;
    }
}