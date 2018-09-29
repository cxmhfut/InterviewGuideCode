package chapter2;

import org.junit.Test;
import utils.DoubleNode;
import utils.Node;
import utils.NodeListUtil;

public class Chapter2Test {

    @Test
    public void testRemoveLastKthNode1() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        NodeListUtil.printNodeList(head);
        RemoveLastKthNode.removeLastKthNode(head, 3);
        NodeListUtil.printNodeList(head);
    }

    @Test
    public void testRemoveLastKthNode2() {
        DoubleNode head = new DoubleNode(1);
        DoubleNode two = new DoubleNode(2);
        DoubleNode three = new DoubleNode(3);
        DoubleNode four = new DoubleNode(4);
        DoubleNode five = new DoubleNode(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.pre = four;
        four.pre = three;
        three.pre = two;
        two.pre = head;

        NodeListUtil.printNodeList(head);
        RemoveLastKthNode.removeLastKthNode(head, 3);
        NodeListUtil.printNodeList(head);
    }
}
