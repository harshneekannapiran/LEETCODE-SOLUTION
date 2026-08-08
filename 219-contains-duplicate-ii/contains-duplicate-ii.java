class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> set=new HashMap<>();
        int n=nums.length;
        int diff=0;
        for(int i=0;i<n;i++){
            if(set.containsKey(nums[i])){      
                int j=set.get(nums[i]);
                diff=i-j;
                if(Math.abs(diff)<=k) 
                    return true;  
             }
             set.put(nums[i],i);
        }

        return false;
    }
}