public class Solution {
    public int searchInsert(int[] A, int target) {
        int lo = 0;
        int hi = A.length-1;
        if(target<=A[lo])
            return lo;
        if(target>A[hi])
            return hi+1;
        while(lo<hi-1){
            int mid = (lo+hi)/2;
            if(A[mid]==target)
                return mid;
            else{
                if(A[mid]>target)
                    hi = mid;
                else 
                    lo = mid;
            }
        }
        return hi;
    }
}
