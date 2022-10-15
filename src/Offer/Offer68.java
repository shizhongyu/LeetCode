package Offer;

import ListNode.ListNode;

public class Offer68 {
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
        ListNode head = reverseBetween(t1, 1, 4);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dump = new ListNode(0);
        dump.next = head;

        ListNode pre = dump;
        ListNode next = null;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        ListNode leftNode = pre.next;
        ListNode rightNode = pre;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }
        next = rightNode.next;

        rightNode.next  = null;
        pre.next = null;
        revert(leftNode);
        pre.next = rightNode;
        leftNode.next = next;
        return dump.next;
    }

    public static ListNode revert(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
