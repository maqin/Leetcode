public class Solution {
    public List<List<String>> partition(String s) {
      List<List<String>> res = new ArrayList<List<String>>();
		  List<String> output = new ArrayList<String>();
		  generate(res, output, s);
		  return res;
	}
	public void generate(List<List<String>> res, List<String> output, String s){
		if(s.length() == 0){
			res.add(output);
			return;
		}
		for(int i = 0; i<s.length(); i++){
			List<String> moreSub = new ArrayList<String>();
			moreSub.addAll(output);
			String pa = s.substring(0, i+1);
			if(isPalindrome(pa)){
				String sub = s.substring(i+1);
				moreSub.add(pa);
				generate(res, moreSub, sub);
			}
		}
	}
	public boolean isPalindrome(String s){
		for(int i = 0; i<s.length()/2; i++)
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				return false;
		return true;
	}
}
