package chess.MoveFinder;

import chess.ChessBoard;
import chess.ChessMove;
import chess.ChessPosition;

import java.util.HashSet;

public class KingMoveFinder {

    public static HashSet<ChessMove> findMoves(ChessBoard chessBoard, ChessPosition chessPosition) {
        int row = chessPosition.getRow();
        int column = chessPosition.getColumn();
        int[][] directions = {{-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}};
        return MoveFinder.findMoves(chessBoard, chessPosition, directions, row, column);
    }
}
