class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list= new ArrayList<>();
        if(p.length()>s.length())
            return list;
        int n=p.length();
        char c1[]=p.toCharArray();
        Arrays.sort(c1);

        for(int i=0;i<=s.length()-n;i++){
            String sub=s.substring(i,i+n);
            char c2[]=sub.toCharArray();
            Arrays.sort(c2);

        if(Arrays.equals(c1,c2))
            list.add(i);
        }
        return list;
    }
}