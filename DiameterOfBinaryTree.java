// time complexity: O(n)
// space complexity: O(n) recurs ion stack space jitna height hoga
// ps: https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1

public class DiameterOfBinaryTree {

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}


    class Solution {
        int diameter(Node root) {
            if(root==null){
                return 0;
            }
            int res[]= {Integer.MIN_VALUE};
            recur(root,res);
            return res[0];
        }
        public int recur(Node root,int res[]){
            if(root==null){
                return 0;
            }
            int lft=recur(root.left,res);
            int rgt=recur(root.right,res);
            res[0]=Math.max(res[0],lft+rgt);
            return Math.max(lft,rgt)+1;
        }
    }

}
