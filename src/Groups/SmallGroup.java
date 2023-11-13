package Groups;

import java.util.ArrayList;

public class SmallGroup implements Group {

	private String name;
    private ArrayList<Character> members = new ArrayList<Character>();

    public SmallGroup(String name) {
        this.name = name;
    }

    public void add(Character caracter) {
    	members.add(caracter);
    }
	
    public void remove(Character caracter) {
        if(members.contains(caracter)) {
        	members.remove(caracter);
        }
    }
    
	@Override
	public String showTheGroup() {
		
		String content = "\n Small group ";
		content += this.name;
        content += ": \n (";
        
        for(int i=0; i<members.size(); i++)
        {
            content+=members.get(i).getClass().getName() +"\n";
        }
        
        content += ") \n";

        return content;
	}

}
