public class trappingRainWater{
    public int trap(int[] height) {
        int result=0;
        if(height==null||height.length<=2)return result;
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        
        left[0]=height[0]; int max=left[0];
        for(int i=1;i<n;i++){
            if(height[i]<max){
                left[i]=max;
            }else{
                max=height[i];
                left[i]=max;
            }
        }
        
        right[n-1]=height[n-1]; max=right[n-1];
        for(int i=n-2;i>=0;i--){
             if(height[i]<max){
                right[i]=max;
            }else{
                max=height[i];
                right[i]=max;
            }
        }
        
        for(int i=1;i<n-1;i++){
            result+=Math.min(left[i],right[i])-height[i];
        }
        return result;
    }
}