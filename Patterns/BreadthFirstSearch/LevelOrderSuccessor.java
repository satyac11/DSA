package Patterns.BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessor {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int value){
            this.value = value;
        }

    }

    static int getSuccessor(TreeNode root,int value){
        if(root == null)
            return -1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left != null)
                queue.add(node.left);
            if(node.right !=null)
                queue.add(node.right);
            if(node.value == value)
                break;
        }
        return queue.poll().value;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(10);
        root.right.left.left = new TreeNode(11);
        System.out.println(getSuccessor(root,12));
    }
}
