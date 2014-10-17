public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        int n = num.length;
        Arrays.sort(num);
        //System.out.println(Arrays.toString(num));
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0; i<n; i++){
            if(i>0 && num[i]==num[i-1])
                continue;
            //System.out.println(i+" "+num[i]);
            for(int j=i+1; j<n; j++){
                if(j>i+1 && num[j]==num[j-1])
                    continue;
               //System.out.println(j+" "+num[j]);
                int t = target-num[i]-num[j];
                int begin = j+1;
                int end = n-1;
                while(begin<end){
                    if(num[begin]+num[end]==t){
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(num[i]);
                        tmp.add(num[j]);
                        tmp.add(num[begin]);
                        tmp.add(num[end]);
                        res.add(tmp);
                        begin++;
                        end--;
                    }else{
                        if(num[begin]+num[end]>t)
                            end--;
                        else
                            begin++;
                    }
                    while(begin<end && begin>j+1 && num[begin-1]==num[begin])
                        begin++;
                    while(end>begin && end<n-1 && num[end]==num[end+1])
                        end--;
                        
                }
            }
                
        }
        return res;
    }
}
