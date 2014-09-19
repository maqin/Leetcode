public class Solution {
    public String reverseWords(String s) {
        StringBuilder rs = new StringBuilder();
		int p = s.length()-1;
		while(p>=0){
			while(p>=0 && s.charAt(p)==' ') p--;
			if(p<0)
			    break;
			StringBuilder s1 = new StringBuilder();			
			while(p>=0 && s.charAt(p)!=' '){
				s1.append(s.charAt(p));
				p--;
			}
			if(rs.length()>0) s1.append(' ');
			s1.reverse();
			rs.append(s1);
		}
		return rs.toString();
    }
}
