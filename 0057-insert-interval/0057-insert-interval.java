class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> sorted = new ArrayList<>();
        boolean insert = false;
        for(int[] interval : intervals){
            if( !insert && interval[0] > newInterval[0]){
                sorted.add(newInterval);
                insert = true;
            }
            sorted.add(interval);
        }
        if(!insert){
            sorted.add(newInterval);
        }
        return merge(sorted);
    }

    private int[][] merge(List<int[]> list){
        List<int[]> merged = new ArrayList<>();
        int start1 = list.get(0)[0];
        int end1 = list.get(0)[1];
        for(int i = 1; i<list.size(); i++){
            int start2 = list.get(i)[0];
            int end2 = list.get(i)[1];
            if( start2 <= end1){
                start1 = start1;
                end1 = Math.max(end1, end2);
                continue;
            }
            merged.add(new int[]{start1, end1});
            start1 = start2;
            end1 = end2;
        }
        merged.add(new int[]{start1, end1});
        return merged.toArray(new int[merged.size()][]);
    }
}