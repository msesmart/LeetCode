public class removeDuplicatesFromSortedArray{
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        int len=nums.length;
        int newLen=1;
        for(int i=1;i<len;i++){
            if(nums[i]!=nums[i-1])newLen++;
            else {
                for(int j=i-1;j<len-1;j++){
                    nums[j]=nums[j+1];
                }
                len--;
                i--;
            }
        }
        return newLen;
    }
}