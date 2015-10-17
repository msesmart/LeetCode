public class longestPalindromicSubstring{
    public String longestPalindrome(String s) {
        if(s==null||s.length()<=1)return s;
        String longest=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            String temp=center(s,i,i);
            if(temp.length()>longest.length())longest=temp;
            temp=center(s,i,i+1);
            if(temp.length()>longest.length())longest=temp;
        }
        return longest;
    }
    public String center(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--; right++;
        }
        return s.substring(left+1,right);
    }
}