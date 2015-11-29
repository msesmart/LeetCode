public class bestTimeToBuySellStockIV {
    public int maxProfit(int k, int[] prices) {
        if(prices==null||prices.length<2||k<1)return 0;
	    int n=prices.length;
	    if(k>n)return solveMaxProfit(prices);
	    else{
	        int[] local=new int[k+1];
	        int[] global=new int[k+1];
	        for(int i=1;i<n;i++){
	            int diff=prices[i]-prices[i-1];
	            for(int j=k;j>=1;j--){
	                local[j]=Math.max(global[j-1]+Math.max(diff,0),local[j]+diff);
	                global[j]=Math.max(global[j],local[j]);
	            }
	        }
	        return global[k];
	    }
    }
    public int solveMaxProfit(int[] prices){
        int res=0;
        for(int i=1;i<prices.length;i++){
            int temp=prices[i]-prices[i-1];
            if(temp>=0)res+=temp;
        }
        return res;
    }
}