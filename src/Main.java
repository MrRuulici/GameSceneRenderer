import java.util.ArrayList;

import Board.GameBoard;
import Characters.CharacterFactory;
import Characters.Character;
import Groups.Group;
import Groups.Legion;
import Groups.SmallGroup;

public class Main {

	public static void main(String[] args) {
		
		GameBoard board = GameBoard.getInstance();
		
		Character firstMan = CharacterFactory.makeMeACharacter(18, 180, new ArrayList<String>(), "Human");

		firstMan.move();
		
		GameBoard.getInstance().render();
		
		SmallGroup smallGroup = new SmallGroup("Romani");
		
		smallGroup.add(firstMan);
		
		Legion legion1 = new Legion("Romanian legion");
		
		legion1.add(smallGroup);
		
		System.out.println(legion1.showTheGroup());

	}
	
}
