public class searchRange{
    public int[] searchRange(int[] nums, int target) {
        if(nums==null||nums.length==0)return null;
        int[] range=new int[2];
        range[0]=-1; range[1]=-1;
        searchRange(nums,0,nums.length-1,target,range);
        return range;
    }
    public void searchRange(int[] nums,int start,int end,int target,int[] range){
        if(start>end)return;
        if(nums[start]==nums[end]&&nums[start]==target){
            range[0]=start; range[1]=end;
            return;
        }
        int mid=(start+end)/2;
        if(target<nums[mid]){
            searchRange(nums,start,mid-1,target,range);
        }else if(target>nums[mid]){
            searchRange(nums,mid+1,end,target,range);
        }else{
            range[0]=mid;
            range[1]=mid;
            int i=mid;
            while(i>start&&nums[i]==nums[i-1]){
                i--;
                range[0]=i;
            }
            i=mid;
            while(i<end&&nums[i]==nums[i+1]){
                i++;
                range[1]=i;
            }
            return;
        }
    }
}