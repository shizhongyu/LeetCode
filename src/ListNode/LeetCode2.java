package ListNode;

public class LeetCode2 {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode dump = new ListNode(0);
        ListNode cur = dump;
        while (l1 != null || l2 != null) {
            int node1 = l1.val;
            int node2 = l2.val;

            int sum = (node1 + node2 + carry) % 10;
            carry = (node1 +  node2 + carry) / 10;
            ListNode node = new ListNode(sum);
            cur.next = node;
            cur = cur.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dump.next;
    }
}
