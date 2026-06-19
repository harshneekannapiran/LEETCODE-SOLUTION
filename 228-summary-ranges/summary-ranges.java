class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start=0;
        ArrayList<String> list=new ArrayList<>();
        if(nums.length==0){
            return list;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1])
                continue;
            else{
                if(start==i)
                   list.add(String.valueOf(nums[i]));
                else{
                     list.add(nums[start]+"->"+nums[i]);
                }
                 start=i+1;
            }
        }
        
                if(start==nums.length-1)
                   list.add(String.valueOf(nums[start]));
                else{
                     list.add(nums[start]+"->"+nums[nums.length-1]);
                }
        return list;
        }

    }
