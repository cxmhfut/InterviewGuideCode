package utils;


public class NodeListUtil {
    public static void printNodeList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void printNodeList(DoubleNode head) {
        DoubleNode cur = head;
        System.out.println("next:");
        while (cur.next != null) {
            System.out.print(cur.value + "->");
            cur = cur.next;
        }
        System.out.println(cur.value);
        System.out.println("pre:");
        while (cur != head) {
            System.out.print(cur.value + "->");
            cur = cur.pre;
        }
        System.out.println(head.value);
    }
}
