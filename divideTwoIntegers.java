public class divideTwoIntegers{
    public int divide(int dividend, int divisor) {
        if(dividend==0)return 0;
        if(divisor==0)return Integer.MAX_VALUE;
        if(divisor==1)return dividend;
        if(divisor==-1){
            if(dividend == Integer.MIN_VALUE)return Integer.MAX_VALUE;
            else return  0-dividend;
        }
        long pDividend=Math.abs((long)dividend);
        long pDivisor=Math.abs((long)divisor);
        int result=0; int numShift=0; long[] div=new long[64];
        div[0]=pDivisor;
        while(pDividend>=div[numShift]){
            numShift++;
            pDivisor=pDivisor<<1;
            div[numShift]=pDivisor;
        }
        numShift--;
        while(numShift>=0){
            if(pDividend>=div[numShift]){
                result+=1<<numShift;
                pDividend=pDividend-div[numShift];
            }
            numShift--;
        }
        if((dividend<0&&divisor>0)||(dividend>0&&divisor<0))return -result;
        else return result;
    }
}