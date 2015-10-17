public class findMinimumInRotatedSortedArray{
    public int findMin(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        int n=nums.length;
        if(n==1)return nums[0];
        return findMin(nums,0,n-1);
    }
    public int findMin(int[] nums,int start,int end){
        if(start+1==end){
            return Math.min(nums[start],nums[end]);
        }
        int mid=(start+end)/2;
        if(nums[mid]<nums[end])return findMin(nums,start,mid);
        else return findMin(nums,mid,end);
        
    }
}