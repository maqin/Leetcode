public class Solution {
    public int maxSubArray(int[] A) {
         int a = A[0];
        int b = A[0];
        for(int i = 1; i<A.length; i++){           
            if(b<0)
                b = 0;
            b += A[i];
            a = Math.max(a, b);
        }
        return a;
    }
}
