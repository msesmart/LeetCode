public class threeSumClosest{
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null||nums.length<3)return 0;
        int n=nums.length; Arrays.sort(nums);
        int close=Integer.MAX_VALUE; int sum=0;
        for(int i=0;i<n-2;i++){
            int div=target-nums[i];
            int left=i+1; int right=n-1;
            while(left<right){
                int sum2=nums[left]+nums[right];
                if(sum2<div){
                    if(Math.abs(sum2-div)<close){
                        close=Math.abs(sum2-div);
                        sum=sum2+nums[i];
                    }
                    left++;
                }else if(sum2>div){
                    if(Math.abs(sum2-div)<close){
                        close=Math.abs(sum2-div);
                        sum=sum2+nums[i];
                    }
                    right--;
                }else{
                    return target;
                }
            }
        }
        return sum;
    }
}