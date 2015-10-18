public class threeSum{
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(nums==null||nums.length<3)return res;
        Arrays.sort(nums); int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i==0||nums[i]>nums[i-1]){
                int target=0-nums[i];
                int left=i+1; int right=n-1;
                while(left<right){
                    int sum=nums[left]+nums[right];
                    if(sum>target){
                        right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        ArrayList<Integer> list=new ArrayList<Integer>();
                        list.add(nums[i]); list.add(nums[left]); list.add(nums[right]);
                        res.add(list);
                        left++; right--;
                        while(left<right&&nums[left]==nums[left-1]){ left++;}
                        while(left<right&&nums[right]==nums[right+1]){ right--;}
                    }
                }
            }
        }
        return res;
    }
}