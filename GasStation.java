public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int[] m = new int[n];
        for(int i = 0; i<n; i++)
            m[i] = gas[i]-cost[i];
        int v1 = 0;
        int v2 = 0;
        int res = -1;
        for(int i = 0; i<n; i++){
            v2 += m[i];
            if(v2<0){
                res = i;
                v1 += v2;
                v2=0;
            }
        }
        return v2+v1>=0?res+1:-1;
    }
}
