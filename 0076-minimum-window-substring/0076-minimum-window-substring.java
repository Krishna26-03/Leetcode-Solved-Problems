class Solution {
    public String minWindow(String s, String t) {
        if( s.length() < t.length()){
            return "";
        }
         int[] need = new int[128];
         int[] have = new int[128];
         for( char ch : t.toCharArray()){
            need[ch]++;
         }
         int required = 0;
         for(int i = 0; i < 128; i++){
            if( need[i] > 0){
                required++;
            }
         }
         int formed = 0;
         int low = 0;
         int start = 0;
         int minLen = Integer.MAX_VALUE;
         for( int high = 0; high < s.length(); high++){
            char ch = s.charAt(high);
            have[ch]++;
            if(need[ch] > 0 && have[ch] == need[ch]){
                formed++;
            }
            while( formed == required){
                int len = high - low + 1;
                if( len < minLen){
                    minLen = len;
                    start = low;
                }
                char leftCh = s.charAt(low);
                if(need[leftCh] > 0 && have[leftCh] == need[leftCh]){
                    formed--;
                }
                have[leftCh]--;
                low++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}