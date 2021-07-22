package Patterns.DepthFirstSearch;

import jdk.nashorn.api.tree.Tree;

import java.util.*;

public class CountAllPathSum {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int value){
            this.value = value;
        }
    }
    public static int countPaths(TreeNode root,int sum){
        List<Integer> currentPath = new LinkedList<>();
        return countPath(root,currentPath,sum);
    }
    static int countPath(TreeNode node,List<Integer> currentPath,int sum){
        if(node == null)
        return 0;
        currentPath.add(node.value);
        int pathSum =0,pathCount=0;
        //check for sum
        ListIterator<Integer> iterator = currentPath.listIterator(currentPath.size());
        while(iterator.hasPrevious()){
            pathSum += iterator.previous();
            if(pathSum==sum)
                pathCount=pathCount+1;
        }

        pathCount = pathCount +countPath(node.left,currentPath,sum);
        pathCount =pathCount+countPath(node.right,currentPath,sum);
        currentPath.remove(currentPath.size()-1);
        return pathCount;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(9);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(7);
        System.out.println("Number of paths with sum 12: "+countPaths(root,12));
    }
}
