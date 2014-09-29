public class Solution {
    public int[] searchRange(int[] A, int target) {
        int[] res = new int[2];
        int start = 0;
        int end = A.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(A[mid] == target){
                int n1 = mid;
                int n2 = mid;
                while(n1>=0 && A[n1]==target)
                    n1--;
                while(n2<A.length && A[n2]==target)
                    n2++;
                res[0] = n1+1;
                res[1] = n2-1;
                return res;
            }
            if(A[mid] > target)
                end = mid-1;
            else if(A[mid] < target)
                start = mid+1;
        }
        res[0] = -1;
        res[1] = -1;
        return res;
    }
}
