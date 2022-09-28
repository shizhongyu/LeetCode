public class LeetCode1513 {
    public static void main(String[] args) {
        String s = "0110111";
//        System.out.println(numSub(s));
        System.out.println(numsub2(s));
    }

    public static int numSub(String s) {
        if (s == null) {
            return 0;
        }
        int j = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '1') {
                continue;
            }
            j = Math.max(j, i + 1);
            while (j < s.length() && s.charAt(j) == '1') {
                j++;
            }
            result += j - i;
        }
        return result;
    }

    public static int numsub2(String s) {
        int res = 0, count = 0, mod = (int) 1e9 + 7;
        for (int i = 0; i < s.length(); ++i) {
            count = s.charAt(i) == '1' ? count + 1 : 0;
            res = (res + count) % mod;
        }
        return res;
    }
}
