public class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthese = new Stack<Character>();
		for(int i = 0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(ch=='('|| ch=='{' ||ch=='[')
				parenthese.add(ch);
			else{
				if(parenthese.size()==0)
					return false;
				char p = parenthese.pop();
				if(ch==')'&&p!='(')
					return false;
				if(ch=='}'&& p!='{')
					return false;
				if(ch==']'&& p!='[')
					return false;
			}
		}
		if(parenthese.size()>0)
			return false;
		return true;
    }
}
