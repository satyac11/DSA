package Patterns.DepthFirstSearch;


import jdk.nashorn.api.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class AllPathsForSum {
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
        }
    }

    private static int allPaths(TreeNode root, int sum) {
        if (root == null)
            return 0;
        if (root.value == sum && root.left == null && root.right == null)
            return 1;

        return allPaths(root.left, sum - root.value) + allPaths(root.right, sum - root.value);
    }

    private static List<List<Integer>> findPaths(TreeNode root,int sum){
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        findPathRecursive(root,sum,currentPath,allPaths);
        return allPaths;
    }
    private static void findPathRecursive(TreeNode currentNode, int sum, List<Integer>currentpath,List<List<Integer>> allpaths){
        if(currentNode == null)
            return;
        currentpath.add(currentNode.value);
        if(currentNode.value==sum && currentNode.left== null && currentNode.right==null)
            allpaths.add(new ArrayList<>(currentpath));
        else{
            findPathRecursive(currentNode.left,sum-currentNode.value,currentpath,allpaths);
            findPathRecursive(currentNode.right,sum-currentNode.value,currentpath,allpaths);
        }

        currentpath.remove(currentpath.size()-1);
    }

    private static List<List<Integer>> findAllPaths(TreeNode root){
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        findPath(root,currentPath,allPaths);
        return allPaths;
    }

    private static void findPath(TreeNode currentNode,List<Integer> currentPath,List<List<Integer>> allPaths){
        if(currentNode == null)
            return ;
        currentPath.add(currentNode.value);
        if(currentNode.left == null && currentNode.right == null)
            allPaths.add(new ArrayList<>(currentPath));
        else{
            findPath(currentNode.left,currentPath,allPaths);
            findPath(currentNode.right,currentPath,allPaths);
        }
        currentPath.remove(currentPath.size()-1);
    }

    public static int maxSum(TreeNode root,int sum) {
        if (root == null) {
            return 0;
        }

        sum = sum + root.value;
        int lsum = maxSum(root.left, sum);
        int rsum = maxSum(root.right, sum);

        int greaterSum = Math.max(lsum, rsum);
        int max = Math.max(greaterSum, sum);
        sum = sum - root.value;

        return max;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(9);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(7);
        //System.out.println("Number of Paths: " + allPaths(root, 12));
        System.out.println("Number of Paths: " + findPaths(root, 12));
        System.out.println("All Paths: "+findAllPaths(root));
    }
}

