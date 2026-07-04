class Solution {
    public int[][] merge(int[][] intervals) {
       // int new[]=new int[2];
       ArrayList<int[]>list=new ArrayList<>();
       Arrays.sort(intervals,(a,b)->{
         return a[0]-b[0];
       });
            int currstart=intervals[0][0];
            int currend=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int nextstart=intervals[i][0];
            int nextend=intervals[i][1];
            if(nextstart<= currend){
                 currend=Math.max(nextend,currend);
            }
            else{
            list.add(new int[]{currstart,currend});
            currstart=nextstart;
            currend=nextend;
            }

        }
        list.add(new int[]{currstart,currend});
        return list.toArray(new int[list.size()][]);
    }
}