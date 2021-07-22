package Patterns.DepthFirstSearch;

public class PathWithGivenSequence {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int value){
            this.value = value;
        }
    }

    static boolean findPath(TreeNode root,int[]sequence){
        TreeNode node = root;
        if(node == null || node.value != sequence[0])
            return false;

        for(int i=1;i<sequence.length;i++){

            if(node.left.value != sequence[i] && node.right.value != sequence[i]){
               return false;
            }
            if(node.left.value == sequence[i]){
                node = node.left;
                continue;
            }
            if(node.right.value == sequence[i]){
                node = node.right;
                continue;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(9);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(7);
        System.out.println("has path: "+findPath(root,new int[]{1,7,5}));
        System.out.println("has path: "+findPath(root,new int[]{1,7,4}));
        System.out.println("has path: "+findPath(root,new int[]{1,2,4}));
        System.out.println("has path: "+findPath(root,new int[]{1,9,2}));
        System.out.println("has path: "+findPath(root,new int[]{1,9,7}));
    }
}
