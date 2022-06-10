package fr.diginamic.automates;

import java.util.Arrays;

public class JeuDeLaVie {
	
	private Cellule[][] playground;

	public static void main(String[] args) {
		
		//TODO add list to save
		JeuDeLaVie game = new JeuDeLaVie(20, 20, 0);
		System.out.println(game);
		while(!game.isEveryoneDead()) {
			for (int i = 0; i < game.playground.length; i++) {
				for (int j = 0; j < game.playground[0].length; j++) {
					game.playground[i][j].turn(game.getAroundCellAlive(i, j));
				}
			}
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				System.err.println(e);
			}
			System.out.println(game);
		}
	}

	public JeuDeLaVie(int x, int y, int startOption) {
		
		playground = new Cellule[x][y];
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				if(Math.random() < 0.5)
					playground[i][j] = new Cellule(false);
				else
					playground[i][j] = new Cellule(true);
			}
		}
	}
	
	
	/** Retourne les cases autours de x,y.
	 * @param x
	 * @param y
	 * @return Cellule[3][3] ou moins si contre un bord
	 */
	public int getAroundCellAlive(int x, int y) {
		int cellAlive = 0;
		for(int i = -1; i < 2; i++) {
			for(int j = -1; j < 2; j++) {
				if(x + i > -1 && x + i < playground.length && y + j > -1 && y + j < playground[0].length && playground[x + i][y + j].isAlive())
					cellAlive++;
			}
		}
		return cellAlive - 1;// on enleve une cellule car la fonction compte la cellule centrale
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
