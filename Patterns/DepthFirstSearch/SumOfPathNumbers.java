package Patterns.DepthFirstSearch;

public class SumOfPathNumbers {
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
        }
    }
    static int sum=0;

    static int sumOfAllPaths(TreeNode root){

        int number=0;
        sumOfPath(root,number);
        return sum;
    }
    static void sumOfPath(TreeNode currentNode,int number){
        if(currentNode==null)
            return;
        number = number*10 + currentNode.value;
        if(currentNode.left == null && currentNode.right == null){
            sum = sum +number;
        }
        else{
            sumOfPath(currentNode.left,number);
            sumOfPath(currentNode.right,number);
        }
        number = number/10;
    }

    static int findRootToLeafPathSum(TreeNode currentNode,int pathSum){
       if(currentNode == null)
           return 0;
       pathSum = pathSum*10+currentNode.value;
       if(currentNode.left == null && currentNode.right == null)
           return pathSum;
       return findRootToLeafPathSum(currentNode.left,pathSum)+findRootToLeafPathSum(currentNode.right,pathSum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(9);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(7);
        System.out.println(sumOfAllPaths(root));
    }

}
