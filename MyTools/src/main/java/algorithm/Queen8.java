package algorithm;

/**
 * @author： xu.yefcion
 * @description：八皇后问题
 * @date： 2019/10/25 22:38
 */

public class Queen8 {

    // 棋盘的格子范围，以及皇后数量
    static final int MAX_NUM = 8;
    int[][] chessBoard = new int[MAX_NUM][MAX_NUM];

    // 判断皇后的落点是否合规
    boolean check(int x, int y) {
        for (int i = 0; i < y; i++) {
            if (chessBoard[x][i] == 1) {
                return false;
            }
            if (x - 1 - i >= 0 && chessBoard[x - 1 - i][y - 1 - i] == 1) {
                return false;
            }
            if (x + 1 + i < MAX_NUM && chessBoard[x + 1 + i][y - 1 - i] == 1) {
                return false;
            }
        }
        return true;
    }

    // 核心逻辑
    boolean settleQueen(int y) {
        if (y == MAX_NUM) {
            return true;
        }
        for (int i = 0; i < MAX_NUM; i++) {
            for (int x = 0; x < MAX_NUM; x++) {
                chessBoard[x][y] = 0;
            }
            if (check(i, y)) {
                chessBoard[i][y] = 1;
                if (settleQueen(y + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    // 打印棋盘当前值
    void printChessBoard() {
        for (int j = 0; j < MAX_NUM; j++) {
            for (int i = 0; i < MAX_NUM; i++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }
}
