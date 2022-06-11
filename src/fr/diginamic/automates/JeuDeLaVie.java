package fr.diginamic.automates;

import java.util.ArrayList;
import java.util.List;

public class JeuDeLaVie {
	
	private Cellule[][] playground;

	public static void main(String[] args) {
		
		List<JeuDeLaVie> game = new ArrayList<>();
		
		int x = 20;
		int y = 20;
		int option = 1;
		
		game.add(new JeuDeLaVie(x, y, option));
		System.out.println(game.get(0));
		while(!game.get(game.size() - 1).isEveryoneDead()) {
			game.add(new JeuDeLaVie(x, y, option));
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					game.get(game.size() - 1).playground[i][j].turn(game.get(game.size() - 2).getAroundCellAlive(i, j));
				}
			}
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				System.err.println(e);
			}
			System.out.println(game.get(game.size() - 1));
		}
	}

	
	/**
	 * @param x weight of the board
	 * @param y height of the board
	 * @param startOption [0] blank board [x] Random Board
	 */
	public JeuDeLaVie(int x, int y, int startOption) {
		
		playground = new Cellule[x][y];
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				if(startOption == 0)
					playground[i][j] = new Cellule(false);
				else {	
					if(Math.random() < 0.5)
						playground[i][j] = new Cellule(false);
					else
						playground[i][j] = new Cellule(true);
				}
			}
		}
	}
	
	
	/** Return the int of alive cell around the coord x and y
	 * @param x
	 * @param y
	 * @return int number of cell around which or alive
	 */
	public int getAroundCellAlive(int x, int y) {
		int cellAlive = 0;
		for(int i = -1; i < 2; i++) {
			for(int j = -1; j < 2; j++) {
				if(x + i > -1 && x + i < playground.length && y + j > -1 && y + j < playground[0].length && playground[x + i][y + j].isAlive())
					cellAlive++;
			}
		}
		if(playground[x][y].isAlive())
			return --cellAlive;
		else
			return cellAlive;
	}
	
	private boolean isEveryoneDead() {
		for (Cellule[] cellules : playground) {
			for (Cellule cell : cellules) {
				if(cell.isAlive())
					return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		for(int i = 0; i < playground.length; i++) {
			for(int j = 0; j < playground[0].length; j++) {
				System.out.print("|" + playground[i][j].toString());
			}
			System.out.println("|");
		}
		return " ";
	}

	
	
	

}
