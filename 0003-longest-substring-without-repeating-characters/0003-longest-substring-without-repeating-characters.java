class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int low = 0;
        int res = 0;
        for(int high = 0; high < s.length(); high++){
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            int len = high - low + 1;
            while( map.size() < len) {
                char leftCh = s.charAt(low);
                map.put(leftCh, map.get(leftCh) - 1);
                if(map.get(leftCh) == 0){
                    map.remove(leftCh);
                }
                low++;
                len = high-low+1;
            }
            res = Math.max(res, len);
        }
        return res;
    }
}