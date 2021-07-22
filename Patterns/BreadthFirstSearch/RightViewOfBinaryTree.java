package Patterns.BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfBinaryTree {

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode next;

        TreeNode(int value) {
            this.value = value;
        }

    }

    static void rightViewOfTree(TreeNode root){
        if(root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            TreeNode lastNode = null;
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode = queue.poll();
                if(currentNode.left!=null)
                    queue.add(currentNode.left);
                if(currentNode.right !=null)
                    queue.add(currentNode.right);
                lastNode = currentNode;
            }
            System.out.println(lastNode.value);

        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(10);
        root.left.left.left = new TreeNode(3);
        rightViewOfTree(root);
    }
}
