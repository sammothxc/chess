package chess.MoveFinder;

import chess.ChessBoard;
import chess.ChessPosition;
import chess.ChessMove;

import java.util.HashSet;

public class MoveFinder {
    public static HashSet<ChessMove> findMoves(ChessBoard chessBoard, ChessPosition chessPosition, int[][] directions, int row, int col) {
        HashSet<ChessMove> moves = HashSet.newHashSet(1);
        for (int[] direction : directions) {
            boolean blocked = false;
            int i = 1;
            while (!blocked) {
                ChessPosition possiblePosition = new ChessPosition(row + direction[1] * i, col + direction[0] * i);
                // if not a possible position- blocked
                if (!(chessPosition.getRow() >= 1 && chessPosition.getRow() <= 8 && chessPosition.getColumn() >= 1 && chessPosition.getColumn() <= 8)) {
                    blocked = true;
                }
                // if move has no position- add move
                // if move is same team position- blocked
                // if move is other team position- add move (prioritize move?)
                else {
                    blocked = true;
                }
                i++;
            }
        }
        return new HashSet<>();
    }
}
