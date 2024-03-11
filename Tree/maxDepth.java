package Tree;

// Height of a binary Tree
public class maxDepth {
        public static void main(String[] args) {
            TreeNode root = new TreeNode(10);
            root.left = new TreeNode(20);
            root.right = new TreeNode(30);
            root.left.left = new TreeNode(40);
            root.left.right = new TreeNode(50);
            root.right.left = new TreeNode(40);
            root.right.right = new TreeNode(50);

            int res = max_Depth(root);
            System.out.println(res);
        }

    private static int max_Depth(TreeNode root) {
            if(root == null) return 0;
            else return Math.max(max_Depth(root.left), max_Depth(root.right)) + 1;
    }

}
