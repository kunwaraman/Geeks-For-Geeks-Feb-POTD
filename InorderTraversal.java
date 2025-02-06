import java.util.*;
// time complexity: O(n)
// space complexity: O(n) 

public class InorderTraversal {
    class Node {
        int data;
        Node left, right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }

    class Solution {
        // Function to return a list containing the inorder traversal of the tree.
        ArrayList<Integer> inOrder(Node root) {
            // Code
            ArrayList<Integer> list = new ArrayList<>();
            if(root==null){
                return list;
            }
            inorder(root,list);
            return list;

        }
        public void inorder(Node root,ArrayList<Integer> list){
            if(root==null){
                return;
            }
            if(root!=null){
                if(root.left!=null){
                    inorder(root.left,list);
                }
                list.add(root.data);
                if(root.right!=null){
                    inorder(root.right,list);
                }
            }
        }
    }
}
