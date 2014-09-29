public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
		HashMap<Integer, Integer> dir = new HashMap<Integer, Integer>();
		for(int i = 0; i<numbers.length; i++){
			int value = target-numbers[i];
			if(dir.containsKey(value)){
				res[0] = dir.get(value)+1;
				res[1] = i+1;
			}else
				dir.put(numbers[i], i);
		}
		return res;
    }
}
