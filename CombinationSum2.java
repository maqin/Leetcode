public class Solution {
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> number = new ArrayList<Integer>();
		Arrays.sort(num);
		generate(res, number, target, 0, num);
		return res;
	}

	public void generate(List<List<Integer>> res, List<Integer> comb,
			int target, int p, int[] num) {
		if (target == 0) {
			res.add(comb);
			return;
		}
		if (p >= num.length || target < 0)
			return;
		for (int i = p; i < num.length; i++) {
			int remaining = target - num[i];
			List<Integer> newComb = new ArrayList<Integer>();
			newComb.addAll(comb);
			newComb.add(num[i]);
			generate(res, newComb, remaining, i + 1, num);
			while(i>=0&&i<num.length-1 && num[i]==num[i+1])
				i++;
		}
	}
}
