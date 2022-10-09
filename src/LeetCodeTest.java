import java.util.*;

public class LeetCodeTest {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(threeSum(nums));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new LinkedList<>(), 0, nums);
        return result;
    }

    public void dfs(List<List<Integer>> result, LinkedList<Integer> list, int index, int[] nums) {
        result.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(result, list, i + 1, nums);
            list.removeLast();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set =  new HashSet<>();
        Arrays.sort(nums);
        int slow = 0;
        int fast = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                break;
            }
            slow = i + 1;
            int target = -nums[i];
            while (slow < fast) {
                if (nums[slow] + nums[fast] == target) {
                    List<Integer> result = new ArrayList<>();
                    result.add(nums[slow]);
                    result.add(nums[fast]);
                    result.add(nums[i]);
                    set.add(result);
                    fast--;
                    slow++;
                } else if (nums[slow] + nums[fast] > target) {
                    fast--;
                } else {
                    slow++;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List> map = new HashMap<>();
        for (String str : strs) {
            int [] chars = new int[26];
            for (int i = 0; i < str.length(); i++) {
                chars[str.charAt(i) - 'a']++;
            }
            String temp = String.valueOf(chars);
            List arrayList = map.getOrDefault(temp, new ArrayList());
            arrayList.add(temp);
            result.add(arrayList);
        }
        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public int climbStairs(int n) {
        if(n < 3) {
            return n;
        }
        int [] A = {1, 2, 3};
        for (int i = 2; i < n; i++) {
            A[2] = A[0] + A[1];
            A[0] = A[1];
            A[1] = A[2];
        }
        return A[2];
    }
}
