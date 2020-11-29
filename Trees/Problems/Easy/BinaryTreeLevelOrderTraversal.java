package Trees.Problems.Easy;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

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

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> level = new ArrayList<>();

        if (root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();

            if (node == null){
                list.add(level);
                level = new LinkedList<>();
                if(queue.size()!=0)
                    queue.add(null);
            }
            else{
                level.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if(node.right !=null)
                    queue.add(node.right);
            }
        }

        return list;


    }

    public static void main(String[] args) {

        TreeNode node3 = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);

        node3.left = node9;
        node3.right = node20;
        node20.left = node15;
        node20.right = node7;

        System.out.println("Level Order: "+levelOrder(node3));

    }
}
