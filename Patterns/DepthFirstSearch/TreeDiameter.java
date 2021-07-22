package Patterns.DepthFirstSearch;

public class TreeDiameter {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int value){
            this.value = value;
        }
    }

    static int findDiameter(TreeNode root){
        if(root == null)
            return 0;
        int count =1;
        return findMaxPath(root.left,count)+findMaxPath(root.right,count)-1;
    }
    static int findMaxPath(TreeNode currentNode,int count){
        if(currentNode == null)
            return count;
        int leftCount = findMaxPath(currentNode.left,count++);
        int rightCount = findMaxPath(currentNode.right,count++);
        return Math.max(leftCount,rightCount);
    }

    static int treeDiameter=0;
    static int findDaimeterOfTree(TreeNode root){
        calculateHeight(root);
        return treeDiameter;
    }
    static int calculateHeight(TreeNode currentNode){
        if(currentNode == null)
            return 0;
        int leftTreeHeight = calculateHeight(currentNode.left);
        int rightTreeHeight =calculateHeight(currentNode.right);

        int diameter = leftTreeHeight+rightTreeHeight+1;
        treeDiameter = Math.max(treeDiameter,diameter);

        return Math.max(leftTreeHeight,rightTreeHeight)+1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(9);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(7);
        //root.right.right.right = new TreeNode(10);
        System.out.println("Diameter of tree is: "+findDiameter(root));
    }
}
