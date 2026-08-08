class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
           int rs=right(nums,i+1,n);
            int ls=left(nums,i-1,0);
            if(rs==ls)
                return i;
        }
        return -1;
    }
    public int right(int[]nums,int start,int end){
        int sum=0;
        for(int i=start;i<end;i++){
            sum+=nums[i];
        }
        return sum;
    }

    public int left(int[]nums,int start,int end){
        int sum=0;
        for(int i=start;i>=end;i--){
            sum+=nums[i];
        }
        return sum;
    }
}