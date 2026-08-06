class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> m1=new HashMap(); 
        if(s.length()!=t.length())
            return false;

        for(char ch:s.toCharArray()){
            m1.put(ch,m1.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            if (!m1.containsKey(ch))
                return false;

            m1.put(ch,m1.get(ch)-1);

            if(m1.get(ch)==0)
                m1.remove(ch);
        }

 
        return m1.isEmpty();
}
}