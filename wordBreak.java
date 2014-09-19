public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        s = "#"+s;
		int n = s.length();
		int[] a = new int[n];
		a[0] = 1;
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<i; j++){
				String sub = s.substring(j, i);
				if(dict.contains(sub)&&a[i-1]==0){
					a[i-1] = a[j-1];
				}
			}
		}
		return a[n-1]==1? true: false;
    }
}
