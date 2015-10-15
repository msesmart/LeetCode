import java.util.HashMap;
public class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] index= new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                index[0]=map.get(nums[i])+1;
                index[1]=i+1;
                break;
            }else{
                map.put(target-nums[i],i);
            }
        }
        return index;
    }
}