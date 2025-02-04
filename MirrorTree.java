import java.util.*;
// time complexity: O(n)
// space complexity: O(n)


public class MirrorTree {
    class Node
    {
        int data;
        Node left, right;
        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    class Solution {
        // Function to convert a binary tree into its mirror tree.
        void mirror(Node node) {
            // Your code here
            if(node==null){
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(node);
            while(!queue.isEmpty()){
                int size = queue.size();
                for(int i=0;i<size;i++){
                    Node curr = queue.remove();
                    Node temp = curr.left;
                    curr.left=curr.right;
                    curr.right=temp;
                    if(curr.right!=null){
                        queue.add(curr.right);
                    }
                    if(curr.left!=null){
                        queue.add(curr.left);
                    }
                }
            }

        }
    }
    /*
    do recursive also
     */
    void mirror(Node node) {
        // Your code here
        if(node==null){
            return;
        }
        Node temp = node.left;
        node.left=node.right;
        node.right=temp;
        mirror(node.left);
        mirror(node.right);
    }
}
