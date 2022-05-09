
public class ChessTest {

	public static void main(String[] args) {
		move M = new move();
		
		
	}

}

class move
{
	void moving() {}
	}

class Chess					 
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

class GraphicalChess extends Chess
{
	void moveMyBishop() {
		super.moveBishop();
		System.out.println("My own Math logic to move bishop in ");
	}
	void moveKnight() {
		System.out.println("Knight is moving in L Shape..any direction/jump over...");
	}
}