package chess.MoveFinder;

import chess.ChessBoard;
import chess.ChessMove;
import chess.ChessPosition;

import java.util.HashSet;

public class PawnMoveFinder {

    public static HashSet<ChessMove> findMoves(ChessBoard chessBoard, ChessPosition chessPosition) {
        int row = chessPosition.getRow();
        int column = chessPosition.getColumn();
        int[][] directions = {{1, 0}, {1, 1}, {1, -1}};
        return MoveFinder.findMoves(chessBoard, chessPosition, directions, row, column);
    }
}
