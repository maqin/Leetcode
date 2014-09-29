public class Solution {
    public int romanToInt(String s) {
	    int n = s.length();
		if(s==null || n==0)
			return 0;
		Map<Character, Integer> dir = new HashMap<Character, Integer>();
		dir.put('I',1);
		dir.put('V',5);
		dir.put('X',10);
		dir.put('L',50);
		dir.put('C',100);
		dir.put('D',500);
		dir.put('M',1000);
		
		int res = dir.get(s.charAt(n-1));
		for(int i = n-2; i>=0; i--){
			if(dir.get(s.charAt(i+1))>dir.get(s.charAt(i)))
				res -= dir.get(s.charAt(i));
			else
				res += dir.get(s.charAt(i));
		}
		
		return res;
    }
}
