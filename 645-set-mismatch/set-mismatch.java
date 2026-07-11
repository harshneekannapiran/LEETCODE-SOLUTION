class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] freq=new int[n+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int k=0;
        int j=0;
        for(int i=1;i<freq.length;i++){
            if(freq[i]>1){
                k=i;
            }
            if(freq[i]==0){
                j=i;
            }
        }
        return new int[]{k,j};
    }
}