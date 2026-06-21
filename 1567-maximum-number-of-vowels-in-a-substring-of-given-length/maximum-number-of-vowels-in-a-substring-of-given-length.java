class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int count=0;
        String s1="aeiou";
       for(int i=0;i<k;i++){
        char ch=s.charAt(i);
            if(s1.indexOf(ch)!=-1)
                count++;
       }
        max=count;
        for(int i=k;i<s.length();i++){
            char left=s.charAt(i-k);
            if(s1.indexOf(left)!=-1){
                count--;
            }
            char right=s.charAt(i);
            if(s1.indexOf(right)!=-1){
                count++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
    // boolean isvowel(char ch){
    //     return ch=='a'||
    //            ch=='o'||
    //            ch=='i'||
    //            ch=='e'||
    //            ch=='u'; 
    // }
}