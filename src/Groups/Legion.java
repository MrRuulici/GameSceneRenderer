package Groups;

import java.util.ArrayList;

public class Legion implements Group {

	private String name;
    private ArrayList<Group> legion = new ArrayList<Group>();

    public Legion(String name) {
        this.name = name;
    }

    public void add(Group group) {
    	legion.add(group);
    }
	
    public void remove(Group group) {
        if(legion.contains(group)) {
        	legion.remove(group);
        }
    }
    
	@Override
	public String showTheGroup() {
		
		String content = "\n Legion ";
		content += this.name;
        content += ": \n (";
        
        for(int i=0; i<legion.size(); i++)
        {
            content+=legion.get(i).showTheGroup() +"\n";
        }
        
        content += ") \n";

        return content;
	}
}
