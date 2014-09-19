public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> res = new Stack<Integer>();
		String operator = "+-*/";
		for(int i = 0; i<tokens.length; i++){
			int p = operator.indexOf(tokens[i]);
			if(p>=0){
				int r1 = res.pop();
				int r2 = res.pop();
				if(p==0)
					res.push(r1+r2);
				else if(p==1)
					res.push(r2-r1);
				else if(p==2)
					res.push(r1*r2);
				else
					res.push((int)(r2/r1));
				
			}else{
				res.push(Integer.parseInt(tokens[i]));
			}
		}
		return res.pop();
    }
}
