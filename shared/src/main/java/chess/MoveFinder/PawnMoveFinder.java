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
        boolean promoted = (team == ChessGame.TeamColor.WHITE && row == 7) || (team == ChessGame.TeamColor.BLACK && row == 2);
        if (promoted) {
            promotionPieces = new ChessPiece.PieceType[]{ChessPiece.PieceType.ROOK, ChessPiece.PieceType.KNIGHT, ChessPiece.PieceType.BISHOP, ChessPiece.PieceType.QUEEN};
        }
        for (ChessPiece.PieceType promotionPiece : promotionPieces) {
            ChessPosition moveForward = new ChessPosition(row + directions, col);
            if (ChessPosition.isSquare(moveForward) && chessBoard.getPiece(moveForward) == null) {
                moves.add(new ChessMove(chessPosition, moveForward, promotionPiece));
            }
            ChessPosition moveLeft = new ChessPosition(row + directions, col - 1);
            if (ChessPosition.isSquare(moveLeft) &&
                    chessBoard.getPiece(moveLeft) != null &&
                    chessBoard.getTeamSquare(moveLeft) != team) {
                moves.add(new ChessMove(chessPosition, moveLeft, promotionPiece));
            }
            ChessPosition moveRight = new ChessPosition(row + directions, col + 1);
            if (ChessPosition.isSquare(moveRight) &&
                    chessBoard.getPiece(moveRight) != null &&
                    chessBoard.getTeamSquare(moveRight) != team) {
                moves.add(new ChessMove(chessPosition, moveRight, promotionPiece));
            }
            ChessPosition doubleForward = new ChessPosition(row + directions * 2, col);
            if (ChessPosition.isSquare(doubleForward) &&
                    ((team == ChessGame.TeamColor.WHITE && row == 2) || (team == ChessGame.TeamColor.BLACK && row == 7)) &&
                    chessBoard.getPiece(doubleForward) == null &&
                    chessBoard.getPiece(moveForward) == null) {
                moves.add(new ChessMove(chessPosition, doubleForward, promotionPiece));
            }
        }
        return moves;
    }
}