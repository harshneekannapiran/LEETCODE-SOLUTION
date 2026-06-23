class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        char a1[]=s1.toCharArray();
        Arrays.sort(a1);
        int n=a1.length;
        for(int i=0;i<=s2.length()-n;i++){
             String s3=s2.substring(i,i+n);
                 char a2[]=s3.toCharArray();
                     Arrays.sort(a2);
        
                 
        if(Arrays.equals(a1,a2))
            return true;
        }
        return false;
    }
}