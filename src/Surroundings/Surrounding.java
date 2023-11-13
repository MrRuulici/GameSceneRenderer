package Surroundings;


public abstract class Surrounding {
	
	private String name;
	private int XupperLeftCorner;
	private int YupperLeftCorner;
		
	public Surrounding(String name, int XupperLeftCorner, int YupperLeftCorner) {
		this.name = name;
		this.XupperLeftCorner = XupperLeftCorner;
		this.YupperLeftCorner = YupperLeftCorner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
