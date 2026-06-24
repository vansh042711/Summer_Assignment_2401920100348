/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        int level = 0;
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            if (curr == null) {
                if (level % 2 != 0) {
                    Collections.reverse(ans);   
                }
                res.add(ans);
                ans = new ArrayList<>();
                level++;
                if (q.isEmpty()) break;
                else q.add(null);
            } else {
                ans.add(curr.val);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return res;
    }
}