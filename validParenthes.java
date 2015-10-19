import java.util.Stack;
public class validParenthes{
    public boolean isValid(String s) {
        if(s==null||s.length()<2)return false;
        
        Stack<Character> stack=new Stack<Character>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{')stack.push(c);
            else{
                if(stack.isEmpty())return false;
                char temp=stack.pop();
                if(c==')'&&temp!='(')return false;
                if(c==']'&&temp!='[')return false;
                if(c=='}'&&temp!='{')return false;
            }
        }
        if(stack.isEmpty())return true;
        else return false;
    }
}