public class FinalTest {
	public static void main(String[] args) {
		
		final float PI=3.14f;
		System.out.println("PI "+PI);
		//PI=3.21f;
		System.out.println("PI "+PI);
	}
}
/*
 *1		Rook	Knight    Bishop	King 	Queen	Bishop	Knight  Rook
 *2		Pawn	Pawn	  Pawn	    Pawn 	Pawn 	Pawn 	Pawn  	Pawn	
 *3 
 *4 		
 *5
 *6
 *7		Pawn	Pawn	  Pawn	    Pawn 	Pawn 	Pawn 	Pawn  	Pawn
 *8		Rook	Knight    Bishop	King 	Queen	Bishop	Knight  Rook
 * 
 * 
 * 
 */
class Chess2 
{
	void moveBishop() { 
		System.out.println("bishop is moving in cross bi-directional...");
	}
	void moveKnight() { 
		System.out.println("Knight is moving in L Shape..any direction/jump over...");
	}
	
	void moveRook() {
			System.out.println("Rook is moving in stright bi-directional....");
	}
	
	void moveQueen() {
			System.out.println("Queen is moving in .. any direction");
	}
	
	}

class GraphicalChess2 extends Chess2 //
{
	void moveMyBishop() {
		super.moveBishop();
		System.out.println("My own Math logic to move bishop in ");
	}
	void moveKnight() { //math logic
		System.out.println("Knight is moving in L Shape..any direction/jump over...");
	}
}