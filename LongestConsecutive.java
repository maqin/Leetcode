public class Solution {
    public int longestConsecutive(int[] num) {
        Map<Integer, Integer> dict = new HashMap<Integer,Integer>();
		int maxV = 0;
		for(int i = 0; i<num.length; i++)
			dict.put(num[i], 0);
		
		for(int i = 0; i<num.length; i++){
			if(dict.get(num[i])==1)
				continue;
			
			int tmp = num[i];
			dict.put(tmp, 1);
			int len = 1;
			
			while(dict.containsKey(tmp+1)){
				//tmp++;
				dict.put(tmp+1, 1);
				tmp++;
				len++;
			}
			tmp = num[i];
			while(dict.containsKey(tmp-1)){
				dict.put(tmp-1, 1);
				tmp--;
				len++;
			}
			
			maxV = Math.max(maxV, len);
		}
		return maxV;
    }
}
