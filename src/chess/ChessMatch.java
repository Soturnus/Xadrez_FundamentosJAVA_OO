package chess;

import boardgame.Board;
import chess.pieces.King_Rei;
import chess.pieces.Rook_Torre;

public class ChessMatch {
	
	private Board board; 
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('c', 1, new Rook_Torre(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook_Torre(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook_Torre(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook_Torre(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook_Torre(board, Color.WHITE));
        placeNewPiece('d', 1, new King_Rei(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook_Torre(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook_Torre(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook_Torre(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook_Torre(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook_Torre(board, Color.BLACK));
        placeNewPiece('d', 8, new King_Rei(board, Color.BLACK));
	}
}