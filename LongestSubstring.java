public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
		int len = s.length();
		HashMap<Character, Integer> dir = new HashMap<Character, Integer>();
		int start = 0;
		for (int j = 0; j < len; j++) {
			char ch = s.charAt(j);
			if (dir.containsKey(ch)) {
				int v = dir.get(ch);
				if (v >= start) {
					res = Math.max(res, j - start);
					//System.out.println(s.substring(start,j));
					start = v+1;
					
				}
				//System.out.println(start + s.substring(start));
			}
			dir.put(ch, j);
		}
		res = Math.max(res, len - start);
		//System.out.println(s.substring(start));
		return res;
    }
}
