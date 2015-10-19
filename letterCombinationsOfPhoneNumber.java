public class letterCombinationsOfPhoneNumber{
    public List<String> letterCombinations(String digits) {
        String[] buttons={" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> list=new ArrayList<String>();
        if(digits==null||digits.length()==0)return list;
        char[] str=new char[digits.length()];
        dfs(digits,0,str,list,buttons);
        return list;
    }
    public void dfs(String digits,int index,char[] str,List<String> list,String[] buttons){
        char c=digits.charAt(index);
        int n=(int)(c-'0');
        String nums=buttons[n];
        if(nums.length()==0){
            if(index==digits.length()-1){
                list.add(new String(str));
            }else{
                dfs(digits,index+1,str,list,buttons);
            }
        }else{
            for(int i=0;i<nums.length();i++){
                str[index]=nums.charAt(i);
                if(index==digits.length()-1){
                    list.add(new String(str));
                }else{
                    dfs(digits,index+1,str,list,buttons);
                }
            }
        }
    }
}