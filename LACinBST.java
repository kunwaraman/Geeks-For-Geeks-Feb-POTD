public class LACinBST {
    /*
    time complexity: O(n)
    space complexity: O(n)
     */
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

            // your code here.
            Node LCA(Node root, Node n1, Node n2) {
                // your code here.
                if(root==null){
                    return null;
                }
                if(root==n1 || root==n2){
                    return root;
                }
                if(root.data<n1.data && root.data<n2.data){
                    return LCA(root.right,n1,n2);
                }
                if(root.data>n1.data && root.data>n2.data){
                    return LCA(root.left,n1,n2);
                }
                return root;
            }

    }

}
