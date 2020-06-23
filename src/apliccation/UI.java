package apliccation;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces){
		for (int r=0; r<pieces.length; r++){
			System.out.print((8 - r)+"|");
			for (int c=0; c<pieces.length; c++){
				printPiece(pieces[r][c]);
			}
			System.out.println("\n\t");
		}
		System.out.println("   A__B__C__D__E__F__G__H");
	}
	
	private static void printPiece(ChessPiece piece){
		if (piece == null){
			System.out.print("|_|");
		} else{
			System.out.print(piece);
		}
		System.out.print("");
	}
	
}
