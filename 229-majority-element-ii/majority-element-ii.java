class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap();
        int nl=nums.length;

        ArrayList<Integer> list=new ArrayList<>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);

            if(map.get(n)>nl/3 && !list.contains(n)){
                list.add(n);
            }   
        }
        return list;
    }
}