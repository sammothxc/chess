package chess.MoveFinder;

import chess.*;
import java.util.HashSet;

public class KnightMoveFinder {
    public static final int[][] directions = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};

    public static HashSet<ChessMove> findMoves(ChessBoard chessBoard, ChessPosition chessPosition) {
        return MoveFinder.findSingleMoves(chessBoard, chessPosition, directions); //fix
    }
}