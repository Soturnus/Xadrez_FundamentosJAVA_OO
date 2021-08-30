package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King_Rei extends ChessPiece {

	public King_Rei(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
}