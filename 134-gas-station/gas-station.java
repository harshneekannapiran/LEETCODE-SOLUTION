class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;

        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
        }
        if(total<0)
            return -1;
    
        int startindex=0;
        int rem=0;

        for(int i=0;i<gas.length;i++){
            int currgas=gas[i]+rem;
            int currcost=cost[i];
            rem=currgas-currcost;

            if(rem<0){
                rem=0;
                startindex=i+1;
            }
        }
        return startindex;
    }
}