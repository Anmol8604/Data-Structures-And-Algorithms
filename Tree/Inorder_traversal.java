package Tree;

public class Inorder_traversal {

    static void inorderTraversal(TreeNode root) {
        if(root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
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

        inorderTraversal(root);

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int key) {
        this.val = key;
        this.left = null;
        this.right = null;
    }
}
