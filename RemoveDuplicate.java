public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length<=1)
            return A.length;
        int p = 1;
        for(int i = 1; i<A.length; i++)
            if(A[i]!=A[i-1])
                A[p++] = A[i];
        return p;
    }
}
