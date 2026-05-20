class Solution {
    public int pivotIndex(int[] nums) {
        int tot=0;

        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
        }

        int ls=0;

        for(int i=0;i<nums.length;i++){
            int rs=tot-ls-nums[i];

            if(rs==ls)
                return i;

            ls+=nums[i];
        }
        return -1;
    }
}