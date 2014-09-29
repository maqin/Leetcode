public class Solution {
    public int reverse(int x) {
        if(x==0) return 0;
        boolean neg = false;
		if(x<0)
			neg = true;
		x = Math.abs(x);
		StringBuilder sb = new StringBuilder();
		for(; x>0; x/=10)
			sb.append(x%10);
		
		int res = Integer.parseInt(sb.toString());
		return res = neg==true? -1*res: res;
    }
}
