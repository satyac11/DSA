package Patterns.BreadthFirstSearch;


import java.util.LinkedList;
import java.util.Queue;

public class ConnectAllLevelOrdeSiblings {
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode next;

        TreeNode(int value) {
            this.value = value;
        }

    }

    static void connectLevlOrders(TreeNode root) {
        if(root==null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode currentNode=null,previousNode = null;
        while (!queue.isEmpty()) {
                currentNode = queue.poll();
                if (previousNode != null)
                    previousNode.next = currentNode;
                previousNode = currentNode;
                if (currentNode.left != null)
                    queue.add(currentNode.left);
                if (currentNode.right != null)
                    queue.add(currentNode.right);

        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(10);
        root.right.left.left = new TreeNode(11);
        connectLevlOrders(root);
    }
}


