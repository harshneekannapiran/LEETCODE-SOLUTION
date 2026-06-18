class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map1=new HashMap();
         HashMap<Integer,Integer>map2=new HashMap();

         for(int num1:nums1){
            map1.put(num1,map1.getOrDefault(num1,0)+1);
         }

         for(int num2:nums2){
            map2.put(num2,map2.getOrDefault(num2,0)+1);
         }
         
         ArrayList <Integer> list=new ArrayList<>();
        
          for(int key:map1.keySet()){
            if(map2.containsKey(key)){
                int times=Math.min(map1.get(key),map2.get(key));
                while(times>0){
                    list.add(key);
                    times--;
                }
            }
          }
          int res[]=new int[list.size()];
          for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
          }
          return res;
    }
}