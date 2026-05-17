class Solution {
    public int findNumbers(int[] nums) {
        int count=0,num,digit;

        for(int i=0;i<nums.length;i++){
            digit=0;
            num=nums[i];

            while(num>0){
                digit++;
                num/=10;
            }

            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}