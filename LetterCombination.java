public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();		
		Arrays.sort(num);
		for(int i = 0; i<num.length; i++){
			if(i>0 && num[i]==num[i-1])
				continue;
			int target = 0-num[i];
			int begin = i+1;
			int end = num.length-1;
			while(begin<end){				
				if(num[begin]+num[end]==target){
					List<Integer> numbers = new ArrayList<Integer>();
					numbers.add(num[i]);
					numbers.add(num[begin]);
					numbers.add(num[end]);
					res.add(numbers);
					while(end>begin && num[end]==num[end-1])
						end--;
					while(begin<end && num[begin]==num[begin+1])
						begin++;
					begin++;
					end--;
				}
				else if(num[begin]+num[end]>target)
					end--;
				else 
					begin++;
			}
		}
		return res;
    }
}
