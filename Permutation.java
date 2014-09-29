public class Solution {
    public List<List<Integer>> permute(int[] num) {
    
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> sub = new ArrayList<Integer>();

		if (num.length == 0)
			return res;
		sub.add(num[0]);
		res.add(sub);
		
		for (int i = 1; i < num.length; i++) {
			List<List<Integer>> tmp = new ArrayList<List<Integer>>();
			for (int k = i; k >=0 ; k--) {
				for (List<Integer> n : res){					
					List<Integer> newsub = new ArrayList<Integer>();
					newsub.addAll(n);
					newsub.add(k, num[i]);
					tmp.add(newsub);
				}								
			}
			res = tmp;
		}
		return res;
    }
}
