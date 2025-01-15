package chess.MoveFinder;

import chess.ChessBoard;
import chess.ChessPiece;
import chess.ChessMove;
import chess.ChessPosition;

import java.util.HashSet;

public class BishopMoveFinder {

    public static HashSet<ChessMove> findMoves(ChessBoard chessBoard, ChessPosition chessPosition) {
        int row = chessPosition.getRow();
        int column = chessPosition.getColumn();
        int[][] directions = {{-1, 1}, {1, 1}, {1, -1}, {-1, -1}};
        return MoveFinder.findMoves(chessBoard, chessPosition, directions, row, column);
    }
}
