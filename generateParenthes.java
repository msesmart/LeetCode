public class generateParenthes{
    public List<String> generateParenthesis(int n) {
        
        List<String> list=new ArrayList<String>();
        if(n<=0)return list;
        if(n==1){list.add(new String("()"));return list;}
        char[] str=new char[2*n];
        dfs(list,n,0,0,str);
        return list;
    }
    public void dfs(List<String> list,int n,int n1,int n2,char[] str){
        if(n1==n2){
            if(n1<n){
                str[n1+n2]='(';
                dfs(list,n,n1+1,n2,str);
            }else if(n1==n){
                list.add(new String(str));
            }
        }else if(n1>n2){
            if(n1==n){
                str[n1+n2]=')'; dfs(list,n,n1,n2+1,str);
            }else if(n1<n){
                str[n1+n2]='('; dfs(list,n,n1+1,n2,str);
                str[n1+n2]=')'; dfs(list,n,n1,n2+1,str);
            }
        }
    }
}