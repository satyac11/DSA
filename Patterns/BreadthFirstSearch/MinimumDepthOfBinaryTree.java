package Patterns.BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
        }
    }

    static int findDepth(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 1;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null)
                    return depth;
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }

            depth = depth + 1;

        }
        return depth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(10);
        root.right.left.left = new TreeNode(11);
        System.out.println(findDepth(root));
    }
}
