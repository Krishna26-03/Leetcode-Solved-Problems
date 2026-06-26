class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int low = 0;
        int maxFreq = 0;
        int ans = 0;
        for(int high = 0; high < s.length(); high++){
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch,0) + 1);
            maxFreq = Math.max(maxFreq, map.get(ch));
            int len = high - low + 1;
            while(len - maxFreq > k){
                char leftCh = s.charAt(low);
                map.put(leftCh, map.get(leftCh) - 1);
                low++;
                len = high - low + 1;
            }
            ans = Math.max(ans, len);
        }
        return ans;
    }
}