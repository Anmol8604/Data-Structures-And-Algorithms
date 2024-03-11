package Tree;

public class Maximum_value {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(60);
        int ans = Integer.MIN_VALUE;
        ans = max(root, ans);
        System.out.println(ans);
    }

    private static int max(TreeNode root, int ans) {
         if(root == null) return 0;

         return Math.max(root.val, Math.max(max(root.left, root.val), max(root.right, root.val)));
    }
}
