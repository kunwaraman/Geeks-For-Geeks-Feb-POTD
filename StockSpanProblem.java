import java.uti.*;
/*
time complexity: O(n)
space complexity: O(n)
 */

public class StockSpanProblem {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        int n = arr.length;
        int ans[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=i+1;
            }else {
                ans[i]=i-stack.peek();
            }
            stack.push(i);
        }
        for(int i=0;i<ans.length;i++){
            list.add(ans[i]);
        }
        return list;

    }
}
