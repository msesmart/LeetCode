public class bestTimeToBuySellStockII {
    public int maxProfit(int[] prices) {
        int n=prices.length; if(n==0)return 0;
        int max=0;
        int low=prices[0]; int high=prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]>=high)high=prices[i];
            else{
                if(high>low)max=max+high-low;
                low=prices[i]; high=low;
            }
        }
        if(high>low)max=max+high-low;
        return max;
    }
}