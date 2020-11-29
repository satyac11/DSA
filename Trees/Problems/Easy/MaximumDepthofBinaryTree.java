package Trees.Problems.Easy;


import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree {

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

    public int maxDepth(TreeNode root) {
        if(root == null )
            return 0;
        if(root.left == null && root.right==null)
            return 1;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(left>right)
            return left+1;
        else
            return right+1;
    }

    public static int bfs(TreeNode root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.offer(null);

        int depth = 1;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null){
                if(node.left != null)
                    queue.add(node.left);
                if(node.right !=null)
                    queue.add(node.right);
            }
            else{
                if(!queue.isEmpty()){
                    depth++;
                    queue.offer(null);
                }
            }
        }
        return depth;


    }

    

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        root.left = node1;
        //root.right = node2;
        //node1.left = node2;
        //node2.right = node4;

        System.out.println("BFS approach depth: "+bfs(root));


    }


}








