class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>list=new ArrayList<>();
        if(p.length() > s.length())
            return list;
        int n=p.length();
        char a1[]=p.toCharArray();
        Arrays.sort(a1);

        for(int i=0;i<=s.length()-n;i++){
            String sub=s.substring(i,i+n);
            char a2[]=sub.toCharArray();
            Arrays.sort(a2);

            if(Arrays.equals(a1,a2))
                list.add(i);
        }
        return list;
    }
}