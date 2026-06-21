class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int count=0;
       for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i)))
                count++;
       }
    
    max=count;
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i-k))){
                count--;
            }
            if(isvowel(s.charAt(i))){
                count++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
    boolean isvowel(char ch){
        return ch=='a'||
               ch=='o'||
               ch=='i'||
               ch=='e'||
               ch=='u'; 
    }
}