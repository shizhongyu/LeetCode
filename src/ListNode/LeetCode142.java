package ListNode;

/**
 * 看下推导过程
 * https://leetcode.cn/problems/linked-list-cycle-ii/solution/huan-xing-lian-biao-ii-by-leetcode-solution/
 */
public class LeetCode142 {
    public static void main(String[] args) {
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(4);
        ListNode t3 = new ListNode(3);
        ListNode t4 = new ListNode(2);
        ListNode t5 = new ListNode(5);
        ListNode t6 = new ListNode(2);
        ListNode t7 = new ListNode(2);
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;
        t5.next = t6;
        t6.next = t7;
        t7.next = t3;
        ListNode head = detectCycle(t1);
        System.out.println(head.val);
    }

    /**
     * 更优
     * https://leetcode.cn/problems/linked-list-cycle-ii/solution/linked-list-cycle-ii-kuai-man-zhi-zhen-shuang-zhi-/
     *
     * @param head
     * @return
     */
    public static ListNode detectCycle02(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }

        }
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;

    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode slow = dump.next;
        ListNode fast = dump.next.next;
        while (fast != null && fast.next != null && fast != slow) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast == slow) {
            fast = dump;
        } else {
            return null;
        }
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

}
