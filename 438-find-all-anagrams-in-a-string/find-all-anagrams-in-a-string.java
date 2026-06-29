class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int pfreq []=new int[26];
        int sfreq []=new int[26];
        ArrayList <Integer> list=new ArrayList<>();

        if(p.length()>s.length()){
            return list;
        }
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            pfreq[ch-'a']++;
        }

         for(int i=0;i<p.length();i++){
            char ch=s.charAt(i);
            sfreq[ch-'a']++;
        }
        if(Arrays.equals(sfreq,pfreq))
            list.add(0);
        int n=p.length();
        for(int i=p.length();i<s.length();i++){
            char left=s.charAt(i-n);
            char right=s.charAt(i);
            sfreq[left-'a']--;
            sfreq[right-'a']++;

            if(Arrays.equals(sfreq,pfreq))
                    list.add(i-n+1);
        }
        return list;
    }
}