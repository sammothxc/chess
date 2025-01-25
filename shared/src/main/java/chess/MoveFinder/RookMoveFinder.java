package chess.MoveFinder;

import chess.*;
import java.util.HashSet;

public class RookMoveFinder {
    public static final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static HashSet<ChessMove> findMoves(ChessBoard chessBoard, ChessPosition chessPosition) {
        return MoveFinder.findMoves(chessBoard, chessPosition, directions);
    }
}