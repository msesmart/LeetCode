/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class firstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==1)return n;
        int left=1;
        int right=n; int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(isBadVersion(mid)){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}