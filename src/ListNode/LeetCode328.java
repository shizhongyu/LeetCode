package ListNode;

public class LeetCode328 {
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

        ListNode head = oddEvenList(t1);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode oddNodeHead = new ListNode(0);
        ListNode evenNodeHead = new ListNode(0);
        ListNode oddNode = oddNodeHead;
        ListNode evenNode = evenNodeHead;
        int i = 1;
        while (head !=null) {
            if (i++ % 2 == 1) {
               oddNode.next = head;
               oddNode = oddNode.next;
            } else {
                evenNode.next = head;
                evenNode = evenNode.next;
            }
            head = head.next;
        }
        evenNode.next = null;
        oddNode.next = evenNodeHead.next;
        return  oddNodeHead.next;
    }
}
