public class Solution {
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
		String roman = "IVXLCDM";
		int d = 1000;
		int r = 6;
		while(num>0&&d>0){
			int p = num/d;
			if(p<=3){
				while(p>0){
					s.append(roman.charAt(r));
					p--;
				}
			}else if(p==4){
				s.append(roman.charAt(r));
				s.append(roman.charAt(r+1));			
			}else if(p==5){
				s.append(roman.charAt(r+1));
			}else if(p>=6 && p<=8){
				int temp = p-5;
				s.append(roman.charAt(r+1));
				while(temp>0){
					s.append(roman.charAt(r));
					temp--;
				}		
				
			}else{
				s.append(roman.charAt(r));		
				s.append(roman.charAt(r+2));
					
			}
			num %= d;
			d /=10;
			r -= 2;
		}
		return s.toString();
    }
}
