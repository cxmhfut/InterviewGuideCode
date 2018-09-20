package chapter3;

import utils.TreeNode;

import java.util.Stack;

/**
 * 分别用递归和非递归方式实现二叉树前序、中序和后序遍历
 */
public class BinaryTree implements BinaryTreeTravel {

    @Override
    public void preOrderRecur(TreeNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.value + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    @Override
    public void inOrderRecur(TreeNode head) {
        if (head == null) {
            return;
        }
        inOrderUnRecur(head.left);
        System.out.print(head.value + " ");
        inOrderUnRecur(head.right);
    }

    @Override
    public void posOrderRecur(TreeNode head) {
        if (head == null) {
            return;
        }
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.print(head.value + " ");
    }

    @Override
    public void preOrderUnRecur(TreeNode head) {
        System.out.println("Pre Order:");
        if (head != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(head);
            while (!stack.isEmpty()) {
                TreeNode cur = stack.pop();
                System.out.print(cur.value + " ");
                if (cur.left != null) {
                    stack.push(cur.left);
                }
                if (cur.right != null) {
                    stack.push(cur.right);
                }
            }
        }
        System.out.println();
    }

    @Override
    public void inOrderUnRecur(TreeNode head) {
        System.out.println("In order:");
        if (head != null) {
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || head != null) {
                if (head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    System.out.print(head.value + " ");
                    head = head.right;
                }
            }
        }
        System.out.println();
    }

    @Override
    public void posOrderUnRecur(TreeNode head) {
        System.out.println("Pos Order:");
        if (head != null) {
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            s1.push(head);
            while (!s1.isEmpty()) {
                head = s1.pop();
                s2.push(head);
                if (head.left != null) {
                    s1.push(head.left);
                }
                if (head.right != null) {
                    s1.push(head.left);
                }
            }
            while (!s2.isEmpty()) {
                System.out.print(s2.pop().value + " ");
            }
        }
        System.out.println();
    }
}
