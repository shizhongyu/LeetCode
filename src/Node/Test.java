//package Node;
//
//public class Test {
//    public static void main(String[] args) {
//        Node n1 = new Node(1);
//        Node n2 = new Node(2);
//        Node n3 = new Node(2);
//        Node n4 = new Node(2);
//        Node n5 = new Node(3);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
//        Node node = test(n1);
//        while (node != null) {
//            System.out.println(node.value);
//            node = node.next;
//        }
//    }
//
//    public static Node test(Node root) {
//        Node dump = new Node(0);
//        dump.next = root;
//        Node current = dump;
//        while (current != null) {
//            Node next = current.next;
//            while (next != null && next.next != null && val == next.next.value) {
//                next = next.next;
//            }
//            if(next == null) {
//                break;
//            }
//            current.next = next;
//            current = next;
//        }
//        return dump.next;
//    }
//
//    public static class Node {
//        int value;
//        Node next;
//
//        public Node(int value) {
//            this.value = value;
//        }
//    }
//}
