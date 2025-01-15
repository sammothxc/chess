package chess;

import chess.MoveFinder.BishopMoveFinder;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {

    private final ChessGame.TeamColor pieceColor;
    private final PieceType type;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.pieceColor = pieceColor;
        this.type = type;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
        return pieceColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        return switch (type) {
            case KING -> throw new RuntimeException("Not implemented"); //KingMoveFinder.findMoves(board, myPosition);
            case QUEEN -> throw new RuntimeException("Not implemented"); //QueenMoveFinder.findMoves(board, myPosition);
            case BISHOP -> BishopMoveFinder.findMoves(board, myPosition);
            case KNIGHT -> throw new RuntimeException("Not implemented"); //KnightMoveFinder.findMoves(board, myPosition);
            case ROOK -> throw new RuntimeException("Not implemented"); //RookMoveFinder.findMoves(board, myPosition);
            case PAWN -> throw new RuntimeException("Not implemented"); //PawnMoveFinder.findMoves(board, myPosition);
        };
    }
}
