/*
time complexity: O(n)
space complexity: O(n)
 */
public class KthSmallestInBST {
    int count=0;
    int ans=-1;
    public int kthSmallest(Node root, int k) {
        // Write your code here
        if(root==null){
            return 0;
        }
        inorder(root,k);
        return ans;
    }
    public void inorder(Node root,int k){
        if(root!=null){
            if(root.left!=null){
                inorder(root.left,k);
            }
            count++;
            if(count==k){
                ans=root.data;
            }
            if(root.right!=null){
                inorder(root.right,k);
            }
        }
    }
}
