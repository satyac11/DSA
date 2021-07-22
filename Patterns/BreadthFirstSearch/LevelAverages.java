package Patterns.BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelAverages {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    static List<Double> getAverages(TreeNode root){
        if(root ==null)
            return null;
        List<Double> averages = new ArrayList<Double>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double sum =0;
            for(int i=0;i<levelSize;i++){
                TreeNode node = queue.poll();
                sum = sum + node.val;
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right !=null)
                    queue.add(node.right);
            }
            averages.add(sum/levelSize);
        }
        return averages;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        System.out.println(getAverages(root));

    }
}
