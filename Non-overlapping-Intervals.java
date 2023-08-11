import java.util.Arrays;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = intervals.length;
        Arrays.sort(intervals, (a, b)->a[1]-b[1]);
        int intervalEnd = intervals[0][1];
        for(int i  = 1  ; i < intervals.length ; i++){
            if(intervalEnd <= intervals[i][0]){
                count--;
                intervalEnd = intervals[i][1];
            }
        }
        return count;
    }
}