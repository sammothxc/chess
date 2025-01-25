package chess.MoveFinder;

import chess.*;
import java.util.HashSet;

public class BishopMoveFinder {
    public static final int[][] directions = {{-1, 1}, {1, 1}, {1, -1}, {-1, -1}};

    public static HashSet<ChessMove> findMoves(ChessBoard chessBoard, ChessPosition chessPosition) {
        return MoveFinder.findMoves(chessBoard, chessPosition, directions);
    }
}
