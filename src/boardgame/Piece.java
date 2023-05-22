package boardgame;

public class Piece {

	protected Position position; // # no UML significa protected
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; // posicao inical nulo, enquanto a peça n esta no tabuleiro.
	}


	protected Board getBoard() {
		return board;
	}

	
}
