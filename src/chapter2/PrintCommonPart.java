package chapter2;

import utils.Node;
import utils.NodeListUtil;

import java.util.Scanner;

/**
 * 打印两个有序链表的公共部分
 */
public class PrintCommonPart {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            Node head1 = new Node(sc.nextInt());
            Node cur = head1;
            for (int i = 1; i < m; i++) {
                cur.next = new Node(sc.nextInt());
                cur = cur.next;
            }
            Node head2 = new Node(sc.nextInt());
            cur = head2;
            for (int i = 1; i < n; i++) {
                cur.next = new Node(sc.nextInt());
                cur = cur.next;
            }
            NodeListUtil.printNodeList(head1);
            NodeListUtil.printNodeList(head2);
            printCommonPart(head1, head2);
        }

        sc.close();
    }

    public static void printCommonPart(Node head1, Node head2) {
        System.out.println("Common Part:");
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                head1 = head1.next;
            } else if (head1.value > head2.value) {
                head2 = head2.next;
            } else {
                System.out.print(head1.value + " ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        System.out.println();
    }
}