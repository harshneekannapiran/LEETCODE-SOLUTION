class Solution {
    public String reverseVowels(String s) {
       
        char[]arr=s.toCharArray();
         int left=0;
        int right=arr.length-1;

        while(left<right){
            while(left<right && (!isVowel(arr[left]))){
                    left++;
            }
            while(left<right && (!isVowel(arr[right]))){
                    right--;
            }
            
            swap(arr,left,right);
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void swap(char arr[],int left,int right){
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public static boolean isVowel(char ch) {
    return ch == 'a' || ch == 'A' || 
           ch == 'e' || ch == 'E' || 
           ch == 'i' || ch == 'I' || 
           ch == 'o' || ch == 'O' || 
           ch == 'u' || ch == 'U';
}

}