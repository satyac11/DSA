package Trees;

import java.util.Scanner;

public class BinaryTree {
    TreeNode root;

    BinaryTree(){
        root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left =  node5;
        node2.right = node6;
    }

    public void postOrderRecursiveTraversal(TreeNode r){
        if(r!= null){
            postOrderRecursiveTraversal(r.left);
            postOrderRecursiveTraversal(r.right);
            System.out.printf("%d ",r.data);
        }
    }

    public void inOrderRecursiveTraversal(TreeNode r){
        if(r!= null){
            inOrderRecursiveTraversal(r.left);
            System.out.printf("%d ",r.data);
            inOrderRecursiveTraversal(r.right);
        }
    }

    public void preOrderRecursiveTraversal(TreeNode r){
        if(r!= null){
            System.out.printf("%d ",r.data);
            preOrderRecursiveTraversal(r.left);
            preOrderRecursiveTraversal(r.right);
        }
    }




    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        System.out.println("Pre Order: ");
        bt.preOrderRecursiveTraversal(bt.root);

        System.out.println("\nPost Order: ");
        bt.postOrderRecursiveTraversal(bt.root);

        System.out.println("\nIn Order: ");
        bt.inOrderRecursiveTraversal(bt.root);
    }
}
