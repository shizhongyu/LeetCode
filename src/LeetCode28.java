public class LeetCode28 {
    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int BASE = 100000;
        int power = 1;
        int targetHashcode = 0;

        for (int i = 0; i <= needle.length(); i++) {
            power = power * 31 % BASE;
        }
        for (int i = 0; i < needle.length(); i++) {
            targetHashcode = (needle.charAt(i) + targetHashcode) * 31 % BASE;
        }

        int currentHashcode = 0;
        for (int i = 1; i <= haystack.length(); i++) {
            currentHashcode = (haystack.charAt(i - 1) + currentHashcode) * 31 % BASE;
            if (i < needle.length()) {
                continue;
            }
            // acbd - a
            if (i > needle.length()) {
                currentHashcode = (currentHashcode - (haystack.charAt(i - needle.length() - 1) * power)) % BASE;
                if (currentHashcode < 0) {
                    currentHashcode += BASE;
                }
            }
            if (currentHashcode == targetHashcode && haystack.substring(i - needle.length(), i).equals(needle)) {
                return i - needle.length();
            }
        }

        return -1;
    }
}
