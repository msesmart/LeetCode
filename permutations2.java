public class permutations2{
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results=new ArrayList<List<Integer>>();
        permuteUnique(nums,0,results);
        return results;
    }
    private void permuteUnique(int[] nums, int start, List<List<Integer>> results){
        if(start>=nums.length){
            List<Integer> list= convertArrayToList(nums);
            results.add(list);
        }
        for(int i=start;i<nums.length;i++){
            if(!containsDuplicate(start,i,nums)){
                swap(start,i,nums);
                permuteUnique(nums,start+1,results);
                swap(start,i,nums);
            }
        }
    }
    private List<Integer> convertArrayToList(int[] nums){
        List<Integer> item = new ArrayList<Integer>();
	    for(int h = 0; h < nums.length; h++) {
		    item.add(nums[h]);
	    }
	    return item;
    }
    private boolean containsDuplicate(int start,int end,int[] nums){
        for(int i=start;i<=end-1;i++){
            if(nums[i]==nums[end])return true;
        }
        return false;
    }
    private void swap(int i,int j,int[] nums){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}