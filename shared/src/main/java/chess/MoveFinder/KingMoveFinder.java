package chess.MoveFinder;

import chess.*;
import java.util.HashSet;

public class KingMoveFinder {
    public static final int[][] directions = {{-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}};

    public static HashSet<ChessMove> findMoves(ChessBoard chessBoard, ChessPosition chessPosition) {
        return MoveFinder.findSingleMoves(chessBoard, chessPosition, directions); //fix
    }
}