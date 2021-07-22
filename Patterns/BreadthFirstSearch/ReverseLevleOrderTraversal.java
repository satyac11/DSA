package Patterns.BreadthFirstSearch;

import jdk.nashorn.api.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class ReverseLevelOrderTraversal {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    static List<List<Integer>> traverse(TreeNode root){
        if(root == null)
            return null;
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left !=null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);

            }
            list.add(0,level);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.right = new TreeNode(9);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(10);
        System.out.println(traverse(root));

    }
}
