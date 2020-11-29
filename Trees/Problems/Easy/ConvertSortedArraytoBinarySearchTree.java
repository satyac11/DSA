package Trees.Problems.Easy;

public class ConvertSortedArraytoBinarySearchTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;

        return binaryTree(nums,0,nums.length-1);

    }

    public TreeNode binaryTree(int []array, int left,int right){
        if(left >right)
            return null;
        int mid = left+(right-left)/2;

        TreeNode node = new TreeNode(array[mid]);
        node.left = binaryTree(array,left,mid-1);
        node.right = binaryTree(array,mid+1,right);
        return node;
    }
}
