package ListNode;

public class LeetCode19 {
    public static void main(String[] args) {

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode fast = dump;
        ListNode slow = dump;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dump.next;
    }
}
