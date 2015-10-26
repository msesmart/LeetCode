public class searchInsertPosition{
    public int searchInsert(int[] nums, int target) {
        return biSearch(nums,target,0,nums.length-1);
    }
    
    public int biSearch(int[] nums,int target,int left,int right){
        if(target>nums[right])return right+1;
        if(target<nums[left])return left;
        
        int mid=(left+right)/2;
        if(target==nums[mid])return mid;
        else if(target<nums[mid])return biSearch(nums,target,left,mid-1);
        else return biSearch(nums,target,mid+1,right);
    }
}