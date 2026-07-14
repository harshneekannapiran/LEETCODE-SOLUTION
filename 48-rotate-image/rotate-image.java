class Solution {
    public void rotate(int[][] matrix) {
        int newmatrix[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                     newmatrix[j][matrix.length-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                     matrix[i][j]=newmatrix[i][j];
            }
        }
        
    }
}