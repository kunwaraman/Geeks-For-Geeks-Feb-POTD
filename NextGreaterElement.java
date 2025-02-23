import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */
public class NextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[n];
        Arrays.fill(ans,-1);
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        for(int i=0;i<ans.length;i++){
            list.add(ans[i]);
        }
        return list;

    }
}
