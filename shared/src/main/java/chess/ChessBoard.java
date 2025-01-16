package chess;

/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard {
    private ChessPiece[][] boardSquares = new ChessPiece [8][8];
    public ChessBoard() {
        
    }

    /**
     * Adds a chess piece to the chessboard
     *
     * @param position where to add the piece to
     * @param piece    the piece to add
     */
    public void addPiece(ChessPosition position, ChessPiece piece) {
        boardSquares[position.getRow()-1][position.getColumn()-1] = piece;
    }

    /**
     * Gets a chess piece on the chessboard
     *
     * @param position The position to get the piece from
     * @return Either the piece at the position, or null if no piece is at that
     * position
     */
    public ChessPiece getPiece(ChessPosition position) {
        return boardSquares[position.getRow()-1][position.getColumn()-1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChessBoard that = (ChessBoard) o;
        return boardSquares.equals(that.boardSquares);
    }


    @Override
    public int hashCode() {
        return 71 * boardSquares.hashCode();
    }

    /**
     * Sets the board to the default starting board
     * (How the game of chess normally starts)
     */
    public void resetBoard() {
        boardSquares = new ChessPiece[8][8];
        ChessPiece.PieceType[] backRowOrder = {
                ChessPiece.PieceType.ROOK,
                ChessPiece.PieceType.KNIGHT,
                ChessPiece.PieceType.BISHOP,
                ChessPiece.PieceType.QUEEN,
                ChessPiece.PieceType.KING,
                ChessPiece.PieceType.BISHOP,
                ChessPiece.PieceType.KNIGHT,
                ChessPiece.PieceType.ROOK
        };
        ChessGame.TeamColor[] colors = {
                ChessGame.TeamColor.BLACK,
                ChessGame.TeamColor.WHITE
        };

        for (ChessGame.TeamColor pieceColor : colors) {
            for (int col = 1; col <= backRowOrder.length; col++) {
                addPiece(new ChessPosition((pieceColor == ChessGame.TeamColor.WHITE) ? 1 : 8, col),
                        new ChessPiece(pieceColor, backRowOrder[col-1]));
                addPiece(new ChessPosition((pieceColor == ChessGame.TeamColor.WHITE) ? 2 : 7, col),
                        new ChessPiece(pieceColor, ChessPiece.PieceType.PAWN));
            }
        }
    }

}
