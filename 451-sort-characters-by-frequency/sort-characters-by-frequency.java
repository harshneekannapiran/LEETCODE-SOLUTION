class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Character> list=new ArrayList<>(map.keySet());

        Collections.sort(list,(a,b)->{
            return map.get(b)-map.get(a);
        });
        // ArrayList<String> ans=new ArrayList<>();

        // for(int i=0;i<list.length();i++){
        //     ans.add(list[i]);
        // }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<list.size();i++){
            for(int j=0;j<map.get(list.get(i));j++){
            ans.append(list.get(i));
        }
        }
        return ans.toString();
    }
}