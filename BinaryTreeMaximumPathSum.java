//https://leetcode.com/problems/binary-tree-maximum-path-sum/
/*
time comaplexity: O(n)
space comaplexity: O(n) recursion stack space
 */

public class BinaryTreeMaximumPathSum {
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxsum;
    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int lft=dfs(root.left);
        int rgt=dfs(root.right);
        int nichehianshai=lft+rgt+root.val; // 1
        int koiekachahai=Math.max(lft,rgt)+root.val; //2
        int shirfrootachahai=root.val; // 3
        maxsum=Math.max(maxsum,Math.max(nichehianshai,Math.max(koiekachahai,shirfrootachahai)));
        return Math.max(koiekachahai,shirfrootachahai);
    }
}
