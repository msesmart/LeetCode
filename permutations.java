import java.util.ArrayList;

public class permutations{
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(nums==null||nums.length==0)return result;
        result.add(new ArrayList<Integer>());
        
        for(int i=0;i<nums.length;i++){
            List<List<Integer>> current=new ArrayList<List<Integer>>();
            for(List<Integer> list:result){
                for(int j=0;j<=list.size();j++){
                    list.add(j,nums[i]);
                    List<Integer> temp=new ArrayList<Integer>(list);
                    current.add(temp);
                    list.remove(j);
                }
            }
            result=new ArrayList<List<Integer>>(current);
        }
        return result;
    }
}