import java.util.*;
// ps: https://practice.geeksforgeeks.org/problems/level-order-traversal/1
// time complexity: O(n)
// space complexity: O(n)

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class LevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> inside = new ArrayList<>();
            Node curr = queue.remove();
            inside.add(curr.data);
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
            list.add(inside);
        }
        return list;
    }
}
