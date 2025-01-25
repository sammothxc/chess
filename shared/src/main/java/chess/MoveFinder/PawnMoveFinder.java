package chess.MoveFinder;

import chess.ChessBoard;
import chess.ChessGame;
import chess.ChessMove;
import chess.ChessPosition;

import java.util.HashSet;

public class PawnMoveFinder {

    public static HashSet<ChessMove> findMoves(ChessBoard chessBoard, ChessPosition chessPosition) {
        HashSet<ChessMove> moves = new HashSet<>(1);
        int row = chessPosition.getRow();
        int col = chessPosition.getColumn();
        ChessGame.TeamColor team = chessBoard.getTeamSquare(chessPosition);
        int directions = team == ChessGame.TeamColor.WHITE ? 1 : -1;

        return moves;
    }
}