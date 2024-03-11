package Tree;

import java.util.*;

public class Level_Order_Traversal_lv {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(60);

        List<List<Integer>> ans = new ArrayList<>();
        ans = levelOrder(root);
        System.out.println(ans);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()) {
            List<Integer> r = new ArrayList<>();
            int c = q.size();
            for(int i = 0; i < c; i++){
                TreeNode cur = q.remove();
                r.add(cur.val);
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
            }
            res.add(r);
        }
        return res;
    }
}
