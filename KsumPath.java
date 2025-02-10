import java.util.*;
/*
time complexity O(n)
space O(n)
 */
public class KsumPath {
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
        int total=0;
        public int sumK(Node root, int k) {
            // code here
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(0,1);
            dfs(root,0,k,map);
            return total;
        }
        public void dfs(Node root,int sum,int target,HashMap<Integer,Integer> map){
            if(root==null){
                return;
            }
            sum+=root.data;
            if(map.containsKey(sum-target)){
                total+=map.get(sum-target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            dfs(root.left,sum,target,map);
            dfs(root.right,sum,target,map);
            map.put(sum,map.get(sum)-1); // backtarck karte waqt freq reduce also currsum ki
        }
    }
}
