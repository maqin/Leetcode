public class Solution {
    public int ladderLength(String start, String end, Set<String> dict) {
        Queue<String> level = new LinkedList<String>();
		Queue<Integer> number = new LinkedList<Integer>();
		number.add(1);
		level.add(start);
		while(!level.isEmpty()){
			String target = level.poll();
			int l = number.poll();
			for(int i = 0; i<target.length(); i++){
				for(char ch = 'a'; ch<='z'; ch++){
					String newStr = target.substring(0, i) + ch + target.substring(i+1);
					if(dict.contains(newStr)){
						level.add(newStr);
						number.add(l+1);
						dict.remove(newStr);
					}
					if(newStr.equals(end))
						return l+1;
				}
			}
			
		}
		
		return 0;
    }
}
