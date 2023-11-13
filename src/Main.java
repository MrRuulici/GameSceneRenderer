import java.util.ArrayList;

import Board.GameBoard;
import Characters.CharacterFactory;
import Groups.Group;

public class Main {

	public static void main(String[] args) {
		
		GameBoard board = GameBoard.getInstance();

		Characters.Character firstMan = CharacterFactory.makeMeACharacter(18, 180, new ArrayList<String>(), "Human");
		
		firstMan.move();
		
		GameBoard.getInstance().render();
	}
	
}
