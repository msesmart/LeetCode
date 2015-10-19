public class fourSum{
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        HashSet<ArrayList<Integer>> set= new HashSet<ArrayList<Integer>>();
        if(nums.length<4)return result;
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    int sum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum<target)k++;
                    else if(sum>target)l--;
                    else{
                        ArrayList<Integer> temp=new ArrayList<Integer>();
                        temp.add(nums[i]); temp.add(nums[j]);
                        temp.add(nums[k]); temp.add(nums[l]);
                        
                        if(!set.contains(temp)){
                            result.add(temp);
                            set.add(temp);
                        }
                        k++; l--;
                    }
                }
                
            }
        }
        return result;
    }
}