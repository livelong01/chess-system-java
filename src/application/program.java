package application;

import chess.ChessMatch;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());
	
	}

}
