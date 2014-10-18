public class Solution {
    public List<String> wordBreak(String s, Set<String> dict) {
        List<String> res = new ArrayList<String>();
		String t = "";
		int n = s.length();
		int[] visit = new int[n+1];//break point
		generate(res,t,dict, 0, s,visit);
		return res;
	}
	public static void generate(List<String> res, String r, Set<String> dict, int level, String s, int[] pos){
		if(level==s.length()){
			res.add(r.substring(0, r.length()-1));
			return ;
		}
		for(int i = level; i<s.length(); i++){
			String t = s.substring(level,i+1);
			if(dict.contains(t) && pos[i+1]==0){
				String sub = r+t+" ";
				int n = res.size();
				generate(res, sub, dict,i+1, s,pos);
				if(res.size()==n)
					pos[i+1] = 1;
			}
		}
    }
}
