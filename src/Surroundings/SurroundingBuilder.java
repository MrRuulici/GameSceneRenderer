package Surroundings;

import java.util.Scanner;

import Board.SceneType;

public class SurroundingBuilder {
	
	private String name;
	private int XupperLeftCorner;
	private int YupperLeftCorner;
	private int type;
	
	public SurroundingBuilder addType(int type){
		
		System.out.println("Alege un tip: "
			+ "\n [1] City"
			+ "\n [2] Vilage");
	
	boolean optionChosed = false;
	
	while(!optionChosed){
		try (Scanner scanner = new Scanner(System.in)) {
			int option = scanner.nextInt();
			
			if(option == 1 || option == 2) {
				this.type = option;
				optionChosed = true;
			}
		}
	}
        return this;
    }
	
	
    public SurroundingBuilder addName(String name)
    {
        this.name = name;
        return this;
    }

    public SurroundingBuilder addXupperLeftCorner(int XupperLeftCorner)
    {
        this.XupperLeftCorner = XupperLeftCorner;
        return this;
    }

    public SurroundingBuilder addYupperLeftCorner(int YupperLeftCorner)
    {
        this.YupperLeftCorner = YupperLeftCorner;
        return this;
    }


    public Surrounding build()
    {
    	if(this.type == 1)
    		return new City(name, XupperLeftCorner, YupperLeftCorner);
    	else if(this.type == 2)
    		return new Vilage(name, XupperLeftCorner, YupperLeftCorner);
    	
		return null;
    }
}
