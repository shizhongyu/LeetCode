import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode215 {
    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 2));

    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    /**
     * 优先队列
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int num : nums) {
            priorityQueue.offer(num);
            if(priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }

}
