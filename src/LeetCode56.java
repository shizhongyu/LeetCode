import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LeetCode56 {
    public static void main(String[] args) {
//        int [][] nums = {{1,3},{2,6},{8,10},{15,18}};
        int [][] nums = {{1, 4}, {0, 4}};
        nums = merge(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }

    public static int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> result = new ArrayList<>();
        int [] newIntervals = intervals[0];
        result.add(newIntervals);
        for (int[] interval : intervals) {
            // for循环里面的判断需要注意。需要逻辑判断
            if(interval[0] <= newIntervals[1]) {
                newIntervals[1] = Math.max(interval[1], newIntervals[1]);
            }else {
                newIntervals = interval;
                result.add(newIntervals);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
