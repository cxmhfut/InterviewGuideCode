package chapter2;

import utils.DoubleNode;
import utils.Node;

/**
 * 在单链表和双链表中删除倒数第k个节点
 */
public class RemoveLastKthNode {

    public static Node removeLastKthNode(Node head, int lastKth) {
        if (head == null || lastKth < 1) {
            return head;
        }
        Node cur = head;

        while (cur != null) {
            lastKth--;
            cur = cur.next;
        }

        if (lastKth == 0) {
            head = head.next;
        }

        if (lastKth < 0) {
            cur = head;
            while (++lastKth != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;//删除cur后一节点
        }

        return head;
    }

    public static DoubleNode removeLastKthNode(DoubleNode head, int lastKth) {
        if (head == null || lastKth < 1) {
            return head;
        }

        DoubleNode cur = head;
        while (cur != null) {
            lastKth--;
            cur = cur.next;
        }

        if (lastKth == 0) {
            //第一个节点即为倒数第k个节点
            head = head.next;
            head.pre = null;
        }

        if (lastKth < 0) {
            cur = head;
            while (++lastKth != 0) {
                cur = cur.next;
            }

            DoubleNode newNext = cur.next.next;
            cur.next = newNext;
            if (newNext != null) {
                newNext.pre = cur;
            }
        }

        return head;
    }

}
