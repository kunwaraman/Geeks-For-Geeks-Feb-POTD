import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */
public class LongestValidParenthesis {
    static int maxLength(String s) {
        // code here
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxi=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(!stack.isEmpty()){
                    maxi=Math.max(maxi,i-stack.peek());
                }else{
                    stack.push(i);
                }
            }
        }
        return maxi;


    }
}
