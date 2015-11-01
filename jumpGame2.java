public class jumpGame2{
    public int jump(int[] nums) {
        if(nums==null||nums.length<2)return 0;
        int n=nums.length;
        int j=n-1; int i=0; int step=0;
        while(j>0){
            while(i<n-1){
                if(nums[i]>=j-i){
                    j=i;
                    i=0;
                    step++;
                    break;
                }else i++;
            }
            //if(i==n-1) return 0;
        }
        return step;
    }
}