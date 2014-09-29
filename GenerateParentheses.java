public class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> res = new ArrayList<String>();
		char[] s = new char[n * 2];
		generate(res, n, n, 0, s);
		return res;
	}

	public void generate(List<String> res, int left, int right,int level, char[] s) {
	    if(left<0 || right<left) return;
		if (left == 0 && right == 0) {
			// System.out.println(s);
			res.add(String.copyValueOf(s));
			return;
		} else {
			if (left > 0) {
				s[level] = '(';
				generate(res, left - 1, right, level + 1, s);
			}
			if (right > 0) {
				s[level] = ')';
				generate(res, left, right - 1, level + 1, s);
			}
		}
	}
}
