package chapter2;

import org.junit.Test;
import utils.Node;
import utils.NodeListUtil;

public class Chapter2Test {

    @Test
    public void testRemoveLastKthNode() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        NodeListUtil.printNodeList(head);
        RemoveLastKthNode.removeLastKthNode(head,3);
        NodeListUtil.printNodeList(head);
    }
}
