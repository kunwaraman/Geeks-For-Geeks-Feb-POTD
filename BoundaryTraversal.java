import java.util.*;
/*
ps 
 */
public class BoundaryTraversal {
    class Node
    {
        int data;
        Node left, right;

        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }


    class Solution {
        ArrayList<Integer> boundaryTraversal(Node node) {
            // code here
            ArrayList<Integer> ans = new ArrayList<>();
            if(node==null){
                return ans;
            }
            ans.add(node.data);
            traverseleft(node.left,ans);
            traverseleaf(node.left,ans);
            traverseleaf(node.right,ans);
            traverseright(node.right,ans);
            return ans;


        }
        void traverseleft(Node root,ArrayList<Integer> ans){
            if(root==null){
                return;
            }
            if(root.left==null && root.right==null){ // means leaf node hai to return
                return;
            }
            ans.add(root.data);
            if(root.left!=null){
                traverseleft(root.left,ans);
            }else {
                traverseleft(root.right,ans);
            }
        }
        void traverseleaf(Node root,ArrayList<Integer> ans){
            if(root==null){
                return;
            }
            if(root.left==null && root.right==null){
                ans.add(root.data);
                return;
            }
            traverseleaf(root.left,ans);
            traverseleaf(root.right,ans);

        }
        void traverseright(Node root,ArrayList<Integer>ans){
            if(root==null){
                return;
            }
            if(root.left==null && root.right==null){
                return;
            }
            if(root.right!=null){
                traverseright(root.right,ans);
            }else{
                traverseright(root.left,ans);
            }
            ans.add(root.data);

        }

    }

}
