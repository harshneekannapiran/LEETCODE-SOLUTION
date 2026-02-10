class Solution {
    public int removeDuplicates(int[]a) {
        int i=0;

        for(int j=i+1;j<a.length;j++){
            if(a[j]!=a[i]){
                a[i+1]=a[j];
                i++;
            }
        }
        return (i+1);
    }
}