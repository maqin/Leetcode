public class Solution {
    public int candy(int[] ratings) {
        int res = 0;
		int[] candy = new int[ratings.length];
		
		for(int i = 0; i<ratings.length; i++){
			if(i==0)
				candy[i]= 1;
			else
				candy[i] = ratings[i]>ratings[i-1]? candy[i-1]+1: 1;
			
		}
		for(int i = ratings.length-2; i>=0; i--)
			if(ratings[i]>ratings[i+1]&&candy[i]<=candy[i+1])
				candy[i] = candy[i+1]+1;
		for(int val: candy)
			res += val;
		return res;
    }
}
