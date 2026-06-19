class Solution {
    public boolean isValidSudoku(char[][] board) {
        // for(int row=0; row<9; row++){
        //     for(int col=0; col<9; col++){
        //         if(board[row][col] != '.'){
        //             char current = board[row][col];
        //             board[row][col] = '.';
        //             if (!isValid(board, row, col, current)) {
        //                 return false;
        //             }

        //             // Restore value
        //             board[row][col] = current;
        //         }
        //     }
        // }

        // HashSet<Character> rows = new HashSet<>();
        // HashSet<Character> cols = new HashSet<>();
        HashSet<String> set = new HashSet<>();
        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                if(board[r][c] != '.'){
                    char ch = board[r][c];
                    String row = "row" + r + ch;
                    String col = "col" + c + ch;
                    String box = "box" + (r/3) +(c/3) + ch;

                    if(!set.add(row) || !set.add(col) || !set.add(box))return false;
                }
            }
        }
        return true;
    }

    // private boolean isValid(char[][] board, int row, int col, int val){
    //     for(int i=0;i<9;i++){
    //         if(board[row][i] == val) return false;
    //     }
    //     for(int i=0;i<9;i++){
    //         if(board[i][col] == val) return false;
    //     }

    //     int boxRow = (row/3)*3;
    //     int boxCol = (col/3)*3;

    //     for(int i=boxRow; i<boxRow+3; i++){
    //         for(int j=boxCol; j<boxCol+3; j++){
    //             if(board[i][j] == val) return false;
    //         }
    //     }
    //     return true;
    // }
}
