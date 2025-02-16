class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> visited = new HashSet<>();
        for (int i = 0; i <9; i++) {
            for (int j = 0; j <9; j++) {
                if(board[i][j]!='.'){
                    if (!visited.add(board[i][j] + "at row" + i) || !visited.add(board[i][j] + "at column" + j)
                        || !visited.add(board[i][j] + "in box" + i / 3 + j / 3)) {
                    return false;
                }
                }
            }
        }
        return true;
    }
}