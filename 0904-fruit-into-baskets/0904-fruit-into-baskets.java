class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int low = 0;
        int res = 0;
        for( int high = 0; high < fruits.length; high++){
            int fruit = fruits[high];
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);
            while(map.size() > 2){
                int leftFruit = fruits[low];
                map.put(leftFruit, map.get(leftFruit) - 1);
                low++;
                if(map.get(leftFruit) == 0){
                    map.remove(leftFruit);
                }
            }
            int len = high-low+1;
            res = Math.max(res,len);
        }
        return res;
    }
}