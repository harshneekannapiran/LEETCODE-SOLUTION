class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashSet <Character> set=new HashSet<>();
            for(int j=0;j<board.length;j++){
            if(board[i][j]=='.'){
                continue;
            }
            if(!set.contains(board[i][j])){
                set.add(board[i][j]);
            }
            
            else{
                return false;
            }
        }
    }
    for(int j=0;j<board.length;j++){
            HashSet <Character> set=new HashSet<>();
            for(int i=0;i<board.length;i++){
            if(board[i][j]=='.'){
                continue;
            }
            if(!set.contains(board[i][j])){
                set.add(board[i][j]);
            }
            
            else{
                return false;
            }
        }
    }
    for(int startRow=0;startRow<9;startRow+=3){
        for(int startCol=0;startCol<9;startCol+=3){
            HashSet<Character> set=new HashSet<>();
            for(int i=startRow;i<startRow+3;i++){
                for(int j=startCol;j<startCol+3;j++){
                    if(board[i][j]=='.'){
                        continue;
                    }
                     if(!set.contains(board[i][j])){
                     set.add(board[i][j]);
            }
            else{
                return false;
            }
                }
            }

        }
    }
    return true;
}
}