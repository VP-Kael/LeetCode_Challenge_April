/*
 Day 20

 Return the root node of a binary search tree that matches the given preorder traversal.

 (Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val,
 and any descendant of node.right has a value > node.val.
 Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)

 It's guaranteed that for the given test cases there is always possible to find a binary search tree with the given requirements.

 Example:
    Input: [8,5,1,7,10,12]
    Output: [8,5,10,1,7,null,12]
 */

public class ConstructBinarySearchTreefromPreorderTraversal {
    int index;

    public TreeNode bstFromPreorder(int[] preorder) {
        index = 0;
        return helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode helper(int[] preorder, int lower, int upper) {
        if (index == preorder.length || preorder[index] < lower
                || preorder[index] > upper) {
            return null;
        }
        int val = preorder[index++];
        TreeNode root = new TreeNode(val);
        root.left = helper(preorder, lower, val);
        root.right = helper(preorder, val, upper);
        return root;
    }
}
