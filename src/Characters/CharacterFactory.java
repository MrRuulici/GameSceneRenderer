package Characters;

import java.util.ArrayList;

//factory method pattern
public class CharacterFactory {

	 public static Character makeMeACharacter(int age, int size, ArrayList<String> abilities, String characterType)
	    {
	        switch (characterType)
	        {
	            case "Human":
	                return new HumanCreator().makeHuman(age, size, abilities);
	            case "Elf":
	                return new ElfCharacter(age, size, abilities);
	            case "Orc":
	            	return new OrcCharacter(age, size, abilities);
	            default:
	                return null;
	        }
	    }
}
