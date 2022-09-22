import java.util.ArrayList;
import java.util.List;

public class LeetCode658 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 2, 3, 3, 4, 7, 7, 8};
        System.out.println(findClosestElements(nums, 3, 5));
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int right = findLeftUpTarget(arr, x);
        int left = right - 1;
        while (result.size() != k) {
            if (right >= arr.length) {
                result.add(0, arr[left]);
                left--;
                continue;
            }
            if (left < 0) {
                result.add(arr[right]);
                right++;
                continue;
            }
            if (Math.abs(arr[right] - x) >= Math.abs(arr[left] - x)) {
                result.add(0, arr[left]);
                left--;
            } else {
                result.add(arr[right]);
                right++;
            }
        }
        return result;
    }

    public static int findLeftUpTarget(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > x) {
                end = mid;
            } else if (arr[mid] < x) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (arr[start] >= x) {
            return start;
        }
        if (arr[end] >= x) {
            return end;
        }
        return end;
    }
}
