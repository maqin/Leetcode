public class Solution {
    public int atoi(String str) {
        int n = str.length();
		//System.out.println(n);
		if(n==0)
			return 0;
		int negative=0;
		int p = 0;
		while(str.charAt(p)==' ')
			p++;
		if(str.charAt(p)=='+'||str.charAt(p)=='-'){
			negative = str.charAt(p)=='-'?1:0;
			p++;
		}
		if(str.charAt(p)<'0'||str.charAt(p)>'9')
			return 0;
		//System.out.println(str.substring(p));
		
		int res = 0;
		while(p<n){
			if(str.charAt(p)<'0'||str.charAt(p)>'9')
				break;
			int value = str.charAt(p)-'0';
			//10*res + value >= Max_Value
			if(res >= Integer.MAX_VALUE/10){
				if(negative==0){
					if(res>Integer.MAX_VALUE/10 || value>=7)
						return Integer.MAX_VALUE;
				}
				else{
					if(-res<Integer.MIN_VALUE/10||value>=8)						
						return Integer.MIN_VALUE;
				}
			}
			res = 10*res + value;
			p++;
		}
		return negative==1?-res:res;
    }
}
