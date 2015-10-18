public class longestCommonPrefix{
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)return "";
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            minLen=Math.min(minLen,strs[i].length());
        }
        if(minLen==0)return ""; char pre='a';
        for(int j=0;j<minLen;j++){
            for(int i=0;i<strs.length;i++){
                if(i==0){pre=strs[i].charAt(j);continue;}
                if(strs[i].charAt(j)!=pre)return strs[0].substring(0,j);
            }
        }
        return strs[0].substring(0,minLen);
    }
}