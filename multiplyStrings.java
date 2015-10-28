public class multiplyStrings{
    public String multiply(String num1, String num2) {
        String n1=new StringBuilder(num1).reverse().toString();
        String n2=new StringBuilder(num2).reverse().toString();
        int[] result=new int[n1.length()+n2.length()];
        for(int i=0;i<n1.length();i++){
            for(int j=0;j<n2.length();j++){
                result[i+j]+=(n1.charAt(i)-'0')*(n2.charAt(j)-'0');
            }
        }
        
        StringBuilder res= new StringBuilder();
        for(int i=0;i<result.length;i++){
            int mod=result[i]%10;
            int carry=result[i]/10;
            if(i+1<result.length){
                result[i+1]+=carry;
            }
            res.insert(0,mod);
        }
        while(res.charAt(0)=='0'&&res.length()>1){
            res.deleteCharAt(0);
        }
        return res.toString();
    }
}