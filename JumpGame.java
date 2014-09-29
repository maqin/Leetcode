public class Solution {
    public boolean canJump(int[] A) {
        int n = A.length;
        if(n==0)
            return true;
		if(A[0]>=A.length-1)
			return true;
		int i = 0;
		while(i<n && A[i]!=0){
		    int futher = 0;
			for(int j = 1; j<=A[i]; j++){
			    if(i+j>=n-1)
			        return true;
				futher = Math.max(j+i+A[j+i], futher);
			}
			i=futher;
		}
		
		return false;
    }
}
