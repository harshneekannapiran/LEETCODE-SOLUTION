class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_left=0;
        for(int i=0;i<gas.length;i++){
            total_left+=gas[i]-cost[i];
        }
        if(total_left<0)
            return -1;

        int startindex=0;
        int rem=0;
        for(int i=0;i<gas.length;i++){
            int currentgas=gas[i]+rem;
            int currentcost=cost[i];
            rem=currentgas-currentcost;

            if(rem<0){
                rem=0;
                startindex=i+1;
            }
        }
        return startindex;
    }
}