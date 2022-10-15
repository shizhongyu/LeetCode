package ListNode;

public class LeetCode206 {
    static   ListNode next = null;;
    public static void main(String[] args) {
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(3);
        ListNode t4 = new ListNode(4);
        ListNode t5 = new ListNode(5);
        ListNode t6 = new ListNode(6);
        ListNode t7 = new ListNode(7);
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;
        t5.next = t6;
        t6.next = t7;
        ListNode head = reverseList(t1,  4);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode reverseList(ListNode head, int n) {

        if(n == 1) {
            next = head.next;
            return head;
        }
        ListNode last = reverseList(head.next, n - 1);
        head.next.next = head;
        head.next = next;
        return last;
    }
}
