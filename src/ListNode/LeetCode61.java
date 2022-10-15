package ListNode;

public class LeetCode61 {
    public static void main(String[] args) {
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(3);
        t1.next = t2;
        t2.next = t3;
        ListNode head = rotateRight(t1, 4);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode fast = dump;
        ListNode slow = dump;
        int i = 0;
        dump.next = head;
        while (fast.next != null) {
            i++;
            fast = fast.next;
        }

        for (int j = i - k % i; j > 0; j--) {
            slow = slow.next;
        }
        ListNode temp = slow.next;
        temp.next = dump.next;
        dump.next = null;
        return temp;
    }


}
