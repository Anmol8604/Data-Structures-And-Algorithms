package Tree;

public class Postorder_traversal {

    static void postTraversal(TreeNode root) {
        if(root != null) {
            postTraversal(root.left);
            postTraversal(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
//        root.left.left = new TreeNode(40);
//        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);

        postTraversal(root);

    }

}