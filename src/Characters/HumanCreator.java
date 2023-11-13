package Characters;

import java.util.ArrayList;

public class HumanCreator {
	
    public HumanCharacter makeHuman(int age, int size, ArrayList<String> abilities) {
    	
        var humanCharacter = new HumanCharacter(age, size, abilities);
        
        return humanCharacter;
        
    }
}
