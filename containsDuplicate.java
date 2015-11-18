public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();
        if(nums==null||nums.length<=1)return false;
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            if(!hm2.containsKey(nums[i])){
                if(hm.containsKey(nums[i])){
                    hm2.put(nums[i],2);
                    hm.remove(nums[i]);
                }else{
                    hm.put(nums[i],1);
                }
            }
        }
        if(hm2.isEmpty())return false;
        else return true;
    }
}