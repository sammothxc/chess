package chess.MoveFinder;

import chess.ChessBoard;
import chess.ChessPosition;
import chess.ChessMove;
import chess.ChessGame;

import java.util.HashSet;

public class MoveFinder {
    public static HashSet<ChessMove> findMoves(ChessBoard chessBoard, ChessPosition chessPosition, int[][] directions) {
        HashSet<ChessMove> moves = HashSet.newHashSet(1);
        int row = chessPosition.getRow();
        int col = chessPosition.getColumn();
        ChessGame.TeamColor team = chessBoard.getTeamSquare(chessPosition);
        for (int[] direction : directions) {
            boolean blocked = false;
            int i = 1;
            while (!blocked) {
                var possiblePosition = new ChessPosition(row + direction[1] * i,
                        col + direction[0] * i);
                // if not a possible position: blocked
                if (!(possiblePosition.getRow() >= 1 && possiblePosition.getRow() <= 8 &&
                        possiblePosition.getColumn() >= 1 && possiblePosition.getColumn() <= 8)) {
                    blocked = true;
                }
                // if move has no position: add move
                else if (chessBoard.getPiece(possiblePosition) == null) {
                    moves.add(new ChessMove(chessPosition, possiblePosition, null));
                }
                // if move is same team position: blocked
                else if (chessBoard.getTeamSquare(possiblePosition) == team) {
                    blocked = true;
                }
                // if move is other team position: add move (prioritize move?)
                else if (chessBoard.getTeamSquare(possiblePosition) != team) {
                    moves.add(new ChessMove(chessPosition, possiblePosition, null));
                    blocked = true;
                }
                // literally anything else
                else {
                    blocked = true;
                }
                i++;
            }
        }
        return moves;
    }

    public static HashSet<ChessMove> findKingMoves(ChessBoard chessBoard, ChessPosition chessPosition, int[][] directions) {
        HashSet<ChessMove> moves = HashSet.newHashSet(1);
        int row = chessPosition.getRow();
        int col = chessPosition.getColumn();
        ChessGame.TeamColor team = chessBoard.getTeamSquare(chessPosition);
        for (int[] direction : directions) {
            var possiblePosition = new ChessPosition(row + direction[1], col + direction[0]);
            if (((possiblePosition.getRow() >= 1) && (possiblePosition.getRow() <= 8) &&
                    (possiblePosition.getColumn() >= 1) && (possiblePosition.getColumn() <= 8)) &&
                    (chessBoard.getTeamSquare(possiblePosition) != team)) {
                moves.add(new ChessMove(chessPosition, possiblePosition, null));
            }
        }
        return moves;
    }
}
