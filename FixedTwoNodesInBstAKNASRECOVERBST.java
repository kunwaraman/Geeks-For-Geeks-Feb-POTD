import java.util.*;
/*
time complexity: O(nlogn)
space complexity: O(n)
 */
public class FixedTwoNodesInBstAKNASRECOVERBST {
    void correctBST(Node root) {
        // code here.
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        Collections.sort(ans);
        reasign(root,ans);
    }
    public void inorder(Node root,ArrayList<Integer> ans){
        if(root!=null){
            if(root.left!=null){
                inorder(root.left,ans);
            }
            ans.add(root.data);
            if(root.right!=null){
                inorder(root.right,ans);
            }
        }
    }
    public void reasign(Node root,ArrayList<Integer>ans){
        if(root!=null){
            if(root.left!=null){
                reasign(root.left,ans);
            }
            root.data=ans.remove(0);
            if(root.right!=null){
                reasign(root.right,ans);
            }
        }
    }
}
