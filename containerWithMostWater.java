public class containerWithMostWater{
    public int maxArea(int[] height) {
        if(height==null||height.length<2)return 0;
        int i=0; int j=height.length-1; int max=0;
        while(i<j){
            int temp=(j-i)*(height[i]<height[j]?height[i]:height[j]);
            if(temp>max)max=temp;
            if(height[i]>height[j])j--;
            else i++;
        }
        return max;
    }
}