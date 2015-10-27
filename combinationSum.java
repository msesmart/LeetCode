public class combinationSum{
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> nums=new ArrayList<Integer>();
        Arrays.sort(candidates);
        sum(candidates,0,target,result,nums);
        return result;
    }
    
    public void sum(int[] candidates,int left,int target,List<List<Integer>> result,List<Integer> nums){
        for(int i=left;i<candidates.length;i++){
            if(candidates[i]>target)return;
            
            int newtarget=target-candidates[i];
            if(newtarget==0){
                nums.add(candidates[i]);
                List<Integer> newNums=new ArrayList<Integer>(nums);
                result.add(newNums);
                nums.remove(nums.size()-1);
                return;
            }else{
                nums.add(candidates[i]);
                sum(candidates,i,newtarget,result,nums);
                nums.remove(nums.size()-1);
            }
          
        }
    }
}