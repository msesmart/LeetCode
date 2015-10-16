import java.util.Stack;
public class evaluateReversePolishNotation{
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<Integer>();
        String operators="+-*/";
        
        for(String s:tokens){
            if(!operators.contains(s)){
                stack.push(Integer.valueOf(s));
            }else{
                int a=stack.pop();
                int b=stack.pop();
                int c=operators.indexOf(s);
                switch (c){
                    case 0: stack.push(a+b); break;
                    case 1: stack.push(b-1); break;
                    case 2: stack.push(a*b); break;
                    case 3: stack.push(b/a); break;
                }
            }
        }
        return stack.pop();
    }
}