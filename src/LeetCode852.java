public class LeetCode852 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0};
        System.out.println(peakIndexInMountainArray(nums));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (arr[start] > arr[end]) {
            return start;
        }
        return end;
    }
}
