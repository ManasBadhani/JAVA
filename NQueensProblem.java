class NQueensProblem {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        char[][] sol = new char[n][n];
        solveNQueens(board, sol, 0);
    }

    public static void solveNQueens(char[][] board, char[][] sol, int col) {
        if (col == board.length) {
            ans(board, sol);
        }
        for (int row = 0; row < board.length; row++) {
            if (safe(row, col, board)) {
                board[row][col] = 'Q';
                solveNQueens(board, sol, col + 1);
                board[row][col] = '0'; 
            }
        }
    }

    public static boolean safe(int row, int col, char[][] board) {
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
            if (board[j][col] == 'Q') {
                return false;
            }
        }

        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        r = row;
        for (int c = col; c >= 0 && r < board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void ans(char[][] board, char[][] sol) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                sol[i][j] = board[i][j];
            }
        }
    }
}
