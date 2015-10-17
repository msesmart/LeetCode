public class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||s==null)return s;
        StringBuilder sb=new StringBuilder();
        int n=s.length(); int step=2*numRows-2;
        for(int i=0;i<numRows;i++){
            if(i==0||i==numRows-1){
                for(int j=i;j<n;j=j+step){
                    sb.append(s.charAt(j));
                }
            }else{
                boolean flag=true;
                int step1=2*(numRows-1-i);
                int step2=step-step1;
                int j=i;
                while(j<n){
                    sb.append(s.charAt(j));
                    if(flag){
                        j=j+step1;
                    }else{
                        j=j+step2;
                    }
                    flag=!flag;
                }
            }
        }
        return sb.toString();
    }
}