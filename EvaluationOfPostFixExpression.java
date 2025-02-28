import java.util.*;
/*
time complexity: O(n)
space complexity: O(n)
 */

public class EvaluationOfPostFixExpression {
    public int evaluate(String[] arr) {
        // code here
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        for(String word:arr){
            if(word.equals("+")||word.equals("-")||word.equals("*")||word.equals("/")){
                int pop1=stack.pop();
                int pop2=stack.pop();

                if(word.equals("+")){
                    stack.push(pop2+pop1);
                }else if(word.equals("*")){
                    stack.push(pop1*pop2);
                }else if(word.equals("-")){
                    stack.push(pop2-pop1);
                }else if(word.equals("/")){
                    stack.push(pop2/pop1);
                }
            }else{
                stack.push(Integer.valueOf(word));
            }
        }
        return stack.peek();
    }
}
