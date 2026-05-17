class Solution {
    public int findNumbers(int[] nums) {
        int num;
        int count=0;
        for(int i=0;i<nums.length;i++){
            num=nums[i];
            int digit=(int)Math.log10(num)+1;
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}