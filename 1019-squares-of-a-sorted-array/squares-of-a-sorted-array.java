class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int res [] =new int[nums.length];
        int index=res.length-1;

        while(i<=j){
             int sq1=nums[i]*nums[i];
             int sq2=nums[j]*nums[j];

             if(sq2>sq1){
                res[index]=sq2;
                j--;
                index--;
             }
             else{
                res[index]=sq1;
                i++;
                index--;
             }
        }
        return res;
    }
}