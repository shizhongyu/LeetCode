package ListNode;

public class LeetCode86 {
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
        ListNode head = partition(t1, 4);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode pre1 = new ListNode(0);
        ListNode pre = pre1;
        ListNode next1 = new ListNode(0);
        ListNode next = next1;
        while (head != null) {
            if(head.val < x) {
                pre.next = head;
                pre = pre.next;
            } else {
              next.next = head;
              next = next.next;
            }
            head = head.next;
        }
        next.next = null;
        pre.next = next1.next;
        return pre1.next;
    }
}
