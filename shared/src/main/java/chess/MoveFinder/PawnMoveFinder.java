package chess.MoveFinder;

import chess.*;
import java.util.HashSet;

public class PawnMoveFinder {

    public static HashSet<ChessMove> findMoves(ChessBoard chessBoard, ChessPosition chessPosition) {
        HashSet<ChessMove> moves = new HashSet<>(1);
        var promotionPieces = new ChessPiece.PieceType[]{null};
        int row = chessPosition.getRow();
        int col = chessPosition.getColumn();
        ChessGame.TeamColor team = chessBoard.getTeamSquare(chessPosition);
        int directions = team == ChessGame.TeamColor.WHITE ? 1 : -1;

        return moves;
    }
}