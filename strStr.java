public class strStr{
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        if(m>n)return -1; if(m==0)return 0;
        
        int[] fail=computeKMPfail(needle);
        
        int i=0; int j=0;
        while(i<n){
            if(haystack.charAt(i)==needle.charAt(j)){
                if(j==m-1)return i-m+1;
                i++;
                j++;
            }else if(j>0){
                j=fail[j-1];
            }else 
                i++;
        }
        return -1;
    }
    private int[] computeKMPfail(String needle){
        int m=needle.length();
        int[] fail=new int[m];
        int i=1; int j=0;
        while(i<m){
            if(needle.charAt(i)==needle.charAt(j)){
                fail[i]=j+1;
                i++; j++;
            }else if(j>0){
                j=fail[j-1];
            }else
                i++;
        }
        return fail;
    }
}