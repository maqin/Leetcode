public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
    List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> comb = new ArrayList<Integer>();
		Arrays.sort(candidates);
		generate(res, comb, target, candidates, 0);
		return res;
	}
	public void generate(List<List<Integer>> res, List<Integer> comb, int target, int[] candidates, int p){
		
		if(target==0){
			res.add(comb);
			return;
		}
		if(p>=candidates.length|| target<0)
			return;
		int value = candidates[p];
		for(int i = 0; i<=target/value; i++){
			int remaining = target-value*i;
			List<Integer> newList = new ArrayList<Integer>();
			newList.addAll(comb);
			int k = i;
			while(k>0){
				newList.add(value);
				k--;
			}
			generate(res, newList, remaining, candidates, p+1);			
		}
	}
}
