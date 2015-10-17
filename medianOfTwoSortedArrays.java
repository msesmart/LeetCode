public class medianOfTwoSortedArrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length; int n=nums2.length;
        int mid=(m+n)/2;
        if((m+n)%2==0){
            return (medianTwoSort(nums1,0,m-1,nums2,0,n-1,mid-1)+medianTwoSort(nums1,0,m-1,nums2,0,n-1,mid))/2.0;
        }else {
            return medianTwoSort(nums1,0,m-1,nums2,0,n-1,mid);
        }
    }
    public double medianTwoSort(int[] nums1,int left1,int right1,int[] nums2,int left2,int right2,int index){
        if(left1>right1)return nums2[left2+index];
        if(left2>right2)return nums1[left1+index];
        if(index==0)return Math.min(nums1[left1],nums2[left2]);
        
        int mid1=(left1+right1)/2;
        int mid2=(left2+right2)/2;
        if(index>=mid1-left1+mid2-left2+1){
            if(nums1[mid1]>nums2[mid2])return medianTwoSort(nums1,left1,right1,nums2,mid2+1,right2,index-mid2+left2-1);
            else if(nums1[mid1]==nums2[mid2])return medianTwoSort(nums1,mid1,right1,nums2,mid2+1,right2,index-mid1+left1-mid2+left2-1);
            else return medianTwoSort(nums1,mid1+1,right1,nums2,left2,right2,index-mid1+left1-1);
        }else{
            if(nums1[mid1]>=nums2[mid2])return medianTwoSort(nums1,left1,mid1-1,nums2,left2,right2,index);
            else return medianTwoSort(nums1,left1,right1,nums2,left2,mid2-1,index);
        }
    }
}