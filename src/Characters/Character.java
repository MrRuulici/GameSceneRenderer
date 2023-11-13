package Characters;

import java.util.ArrayList;
import java.util.Scanner;

import Board.GameBoard;

public class Character {
	
	private int age;
	private int positionX = 0;
	private int positionY = 0;
	private int size;
	private ArrayList<String> abilities;
	
	protected Character(int age, int size, ArrayList<String> abilities) {
		super();
		this.age = age;
		this.size = size;
		this.abilities = abilities;
		
		GameBoard.getInstance().getBoard()[0][0] = this;
	}

	public void move() {

		GameBoard.getInstance().getBoard()[this.positionX][this.positionY] = null;

		System.out.println("Ofera coordonatele in care vrei sa muti characterul:");

		boolean moved = false;

		while (!moved) {

			Scanner scanner = new Scanner(System.in);

			GameBoard gameBoard = GameBoard.getInstance();

			System.out.println("Ofera coordonata x");
			int x = scanner.nextInt();

			if (x < 1 && x > gameBoard.getBoard().length) {
				
				System.out.println("Inafara tablei de joc, ofera o alta coordonata x");
			} else {
				this.positionX = x;
				System.out.println("Ofera coordonata y");
				int y = scanner.nextInt();

				if (y < 1 || y > gameBoard.getBoard()[0].length) {
					System.out.println("Inafara tablei de joc");
				} else {
					this.positionY = y;

					if (gameBoard.getBoard()[positionX][positionY] != null && gameBoard.getBoard()[positionX][positionY].getClass().getName() == "House") {
						System.out.println("Există o casă!");
					} else {
						gameBoard.getBoard()[this.positionX][this.positionY] = this;
						moved = true;
					}
				}
			}

		}

	}
}
