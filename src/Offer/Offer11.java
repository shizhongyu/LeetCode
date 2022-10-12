package Offer;

public class Offer11 {
    public static void main(String[] args) {
        int [] nums = {3,3,1,3};
        System.out.println(minArray(nums));
    }

    public static int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if(numbers[mid] > numbers[right]) {
                left = mid;
            }else if(numbers[mid] < numbers[right]){
                right = mid;
            }else {
                right--;
            }
        }
        return Math.min(numbers[left], numbers[right]);
    }
}
