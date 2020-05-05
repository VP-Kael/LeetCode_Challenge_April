/*
 Day 11

 Given a binary tree, you need to compute the length of the diameter of the tree.
 The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 This path may or may not pass through the root.

 Example:
 Given a binary tree
          1
         / \
        2   3
       / \
      4   5

  Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
  Note: The length of path between two nodes is represented by the number of edges between them.
 */

import java.util.Map;
import java.util.HashMap;

public class DiameterofBinaryTreeSolution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Map<String,Integer> map = new HashMap<>();
        map.put("MAX", 0);
        helper(root,map);
        return map.get("MAX");
    }

    private int helper(TreeNode root, Map<String,Integer> map) {
        if (root == null) return 0;
        int h1 = helper(root.left, map);
        int h2 = helper(root.right,map);
        map.put("MAX", Math.max(map.get("MAX"),h1+h2));
        return Math.max(h1,h2)+1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
