package Board;
import java.util.ArrayList;
import java.util.Scanner;

import Groups.Group;


//Singleton pattern
public class GameBoard {

	private static GameBoard gameBoard;
	
	private Object[][] board;
	private SceneType sceneType;
	private int numberOfHouses;
	
	private GameBoard(int width, int length, SceneType sceneType, int numberOfHouses) {
		this.board = new Object[width][length];
		this.sceneType = sceneType;
		this.numberOfHouses = numberOfHouses;
		
		Scanner scanner = new Scanner(System.in);
	
		for(int i=0; i<numberOfHouses; i++) {
		
			System.out.println("Introduceti pozitia X pentru casa numarul "+ i +": ");
			int X = scanner.nextInt();
			System.out.println("Introduceti pozitia Y pentru casa numarul "+ i +": ");
			int Y = scanner.nextInt();
		
			board[X][Y] = new House(sceneType, X, Y);
		}
	}
	
	public Object[][] getBoard() {
		return this.board;
	}

	public static GameBoard getInstance() {
		if (gameBoard == null) {
			int width, length;
						
			Scanner scanner = new Scanner(System.in);
			System.out.println("Introduceti latimea:");
			width = scanner.nextInt();
			System.out.println("Introduceti lungimea:");
			length= scanner.nextInt();
			
			SceneType sceneType = chooseSceneType();
			
			int numberOfHouses = chooseNumberOfHouses(sceneType);
			
			gameBoard = new GameBoard(width, length, sceneType, numberOfHouses);
		}

		return gameBoard;
	}
	
	private static SceneType chooseSceneType() {
		
		System.out.println("Alege o optiune: "
				+ "\n [1] European"
				+ "\n [2] Asian"
				+ "\n [3] African");
		
		boolean optionChosed = false;
		
		while(!optionChosed){
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();
				
			if(option == 1)
				return SceneType.European;
			else if(option == 2)
				return SceneType.Asian;
			else
				return SceneType.African;
			}
		return SceneType.European;
	}
	
	private static int chooseNumberOfHouses(SceneType sceneType) {
		
		int numberOfHouses;
		System.out.println("Alege un numar de case: ");
		
		Scanner scanner = new Scanner(System.in);
			numberOfHouses = scanner.nextInt();
		
		return numberOfHouses;
	}
	
	public void render() {
		
		for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
            	
            	if(board[i][j] != null)
            		System.out.println(board[i][j].getClass().getName() + ": x="+ i + " y=" + j +"  ");

            }
        }
	}
}
