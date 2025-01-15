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
        int[][] moves = {{-1, 1}, {1, 1}, {1, -1}, {-1, -1}};
        throw new RuntimeException("Not implemented");
    }
}
