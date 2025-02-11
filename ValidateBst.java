/*
ps: https://practice.geeksforgeeks.org/problems/validate-bst/1
time complexity: O(n)
space complexity: O(n)
 */

public class ValidateBst {
    boolean isBST(Node root) {
        // code here.
        return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    boolean check(Node root,int min,int max){
        if(root==null){
            return true;
        }
        if(root.data<=min || root.data>=max){
            return false;
        }
        boolean lft=check(root.left,min,root.data);
        boolean rgt=check(root.right,root.data,max);
        return lft&&rgt;
    }
}
