package Trees.Problems.Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ValidateBinarySearchTree {

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

    public static boolean isValidBST(TreeNode root) {
        if (root == null)
            return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();

            if((node.left !=null && node.left.val>=node.val)||(node.right !=null && node.right.val<=node.val))
                return false;
            if(node.left.val>=root.val)
                return false;
            if(node.right.val <=root.val)
                return false;
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);
        }
        return true;

    }
    static List<Integer> list = new ArrayList<>();
    public static void inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.left);
            list.add(root.val);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }

    public static boolean isSorted(List list){
        if(list.size()==0)
            return false;
        int prev = (int)list.get(0);
        for (int i=1;i<list.size();i++){
            int val = (int)list.get(i);
            if(prev>=val)
                return false;
            else
                prev = val;
        }
        return true;
    }


    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node6 = new TreeNode(6);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node5.left = node1;
        node5.right = node4;

        node4.left =node3;
        node4.right=node6;

        /*node1.left = node2;
        node1.right = node3;*/
        //root.right = node2;
        //node1.left = node2;
        //node2.right = node4;

        //System.out.println("is Binary Tree: "+isValidBST(node2));
        inOrder(null);
        System.out.println(isSorted(list));
        double inorder = Double.MAX_VALUE;
        //System.out.println("is Binary Tree: "+inOrder(node2));


    }
}
