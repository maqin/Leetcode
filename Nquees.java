public class Solution {
    public List<String[]> solveNQueens(int n) {
     String[] sub = new String[n];
		List<String[]> res = new ArrayList<String[]>();
		generate(res, n, sub, 0);
		return res;
	}
	public static void generate(List<String[]> res, int n, String[] sub, int level){
		if(level==n){
			res.add(sub.clone());
			return;
		}
		for(int i = 0; i<n; i++){
			
			if(noAttach(level, i, sub)){
				String s = "";
				for(int j = 0; j<n; j++)
					if(j==i)
						s += 'Q';
					else
						s += '.';
				sub[level] = s;
				generate(res, n, sub, level+1);
			}
		}
	}
	public static boolean noAttach(int m, int n, String[] sub){
		int len = sub.length;
		for(int i = 0; i<m; i++){
			if(sub[i].charAt(n)=='Q')
				return false;
			for(int j = 0; j<len; j++){
				if(Math.abs(i-m)==Math.abs(j-n)&&sub[i].charAt(j)=='Q')
					return false;
			}
		}
		return true;
		
	}   
}
