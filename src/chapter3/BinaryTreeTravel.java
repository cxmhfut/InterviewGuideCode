package chapter3;

import utils.TreeNode;

public interface BinaryTreeTravel {

    /**
     * 递归先序遍历
     */
    void preOrderRecur(TreeNode head);

    /**
     * 递归中序遍历
     */
    void inOrderRecur(TreeNode head);

    /**
     * 递归后序遍历
     */
    void posOrderRecur(TreeNode head);

    /**
     * 非递归先序遍历
     */
    void preOrderUnRecur(TreeNode head);

    /**
     * 非递归中序遍历
     */
    void inOrderUnRecur(TreeNode head);

    /**
     * 非递归后序遍历
     */
    void posOrderUnRecur(TreeNode head);
}
