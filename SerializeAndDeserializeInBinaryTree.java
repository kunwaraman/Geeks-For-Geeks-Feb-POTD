import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */
public class SerializeAndDeserializeInBinaryTree {
    class Tree{
        int data;
        Tree left,right;
        Tree(int d){
            data=d;
            left=right=null;
        }
    }

    class Tree {
        // Function to serialize a tree and return a list containing nodes of tree.
        public ArrayList<Integer> serialize(Node root) {
            // code here
            ArrayList<Integer> list = new ArrayList<>();
            if(root==null){
                return list;
            }
            serializehelper(root,list);
            return list;
        }
        public void serializehelper(Node root,ArrayList<Integer> list){
            if(root==null){
                list.add(-1);
                return;
            }
            list.add(root.data);
            serializehelper(root.left,list);
            serializehelper(root.right,list);
        }

        // Function to deserialize a list and construct the tree.
        public Node deSerialize(ArrayList<Integer> arr) {
            // code here
            Queue<Integer> queue = new LinkedList<>();
            for(int i=0;i<arr.size();i++){
                queue.add(arr.get(i));
            }
            return deSerializehelper(queue);
        }
        public Node deSerializehelper(Queue<Integer> queue){
            if(queue.isEmpty()){
                return null;
            }
            int curr = queue.remove();
            if(curr==-1){
                return null;
            }
            Node root = new Node(curr);
            root.left=deSerializehelper(queue);
            root.right=deSerializehelper(queue);
            return root;
        }
    };
}
