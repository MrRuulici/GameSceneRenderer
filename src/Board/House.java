package Board;

public class House {

	private String material;
	private int X;
	private int Y;

	public House(SceneType sceneType, int X, int Y) {

		if(sceneType.equals(sceneType.African))
			this.material = "Wail and kane";
		else if(sceneType.equals(sceneType.Asian))
			this.material = "Bamboo";
		else if(sceneType.equals(sceneType.European))
			this.material = "Concrete";
			
		this.X = X;
		this.Y = Y;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
