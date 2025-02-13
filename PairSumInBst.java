import java.util.*;
/*
time complexity O(n)
space complexity O(n)
 */
public class PairSumInBst {
    class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }

    class Solution {
        boolean findTarget(Node root, int target) {
            ArrayList<Integer> list = new ArrayList<>();
            inorder(root,list);
            int n = list.size();
            int start=0;
            int end = n-1;
            while(start<end){
                if(list.get(start)+list.get(end)==target){
                    return true;
                }else if(list.get(start)+list.get(end)<target){
                    start++;
                }else{
                    end--;
                }
            }
            return false;
        }
        public void inorder(Node root,ArrayList<Integer> list){
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
