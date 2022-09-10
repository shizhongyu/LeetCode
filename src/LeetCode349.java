import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode349 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4, 6};
        int[] nums2 = {1, 2, 2, 8, 6, 9};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int maxLength = 0;
        int minLength = 0;
        if (nums1.length > nums2.length) {
            maxLength = nums1.length;
            minLength = nums2.length;
        } else {
            maxLength = nums2.length;
            minLength = nums1.length;
        }
        Set<Integer> set = new HashSet<>();
        int[] nums = new int[minLength];
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        int k = 0;
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                set.remove(nums2[i]);
                nums[k++] = nums2[i];
            }
        }
        return Arrays.copyOfRange(nums, 0, k);
    }
}
