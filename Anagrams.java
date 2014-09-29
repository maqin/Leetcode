public class Solution {
    public List<String> anagrams(String[] strs) {
        List<String> res = new ArrayList<String>();
		Map<String, List<String>> dict = new HashMap<String, List<String>>();
		if (strs.length <= 1)
			return res;
		for(int i = 0; i<strs.length; i++){
			String t = strs[i];
			char[] ch = strs[i].toCharArray();
			Arrays.sort(ch);
			String s = new String(ch);
			if(dict.containsKey(s)){
				dict.get(s).add(t);
			}else{
				List<String> l = new ArrayList<String>();
				l.add(t);
				dict.put(s, l);
			}
		}
		
		for(List<String> list: dict.values()){
			if(list.size()>1){
				res.addAll(list);
			}
		}
		return res;
    }
}
