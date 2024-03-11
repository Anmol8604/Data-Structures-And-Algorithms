package Tree;

public class Preorder_traversal {

    static void preTraversal(TreeNode node) {
        if(node != null) {
            System.out.print(node.val + " ");
            preTraversal(node.left);
            preTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);

        preTraversal(root);

    }
}
