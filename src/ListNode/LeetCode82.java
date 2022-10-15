package ListNode;

public class LeetCode82 {
    public static void main(String[] args) {
        ListNode t1 = new ListNode(2);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(2);
        ListNode t4 = new ListNode(3);
        ListNode t5 = new ListNode(3);
        ListNode t6 = new ListNode(5);
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;
        t5.next = t6;
        ListNode node = deleteDuplicates(t1);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode cur = dump;
        while (cur != null) {
            ListNode nextNode = cur.next;
            if(nextNode != null && nextNode.next != null && nextNode.val == nextNode.next.val) {
                int value = nextNode.val;
                while (nextNode != null && nextNode.val == value) {
                    cur.next = nextNode.next;
                    nextNode = nextNode.next;
                }
            }else {
                cur = cur.next;
            }
        }
        return dump.next;
    }
}
