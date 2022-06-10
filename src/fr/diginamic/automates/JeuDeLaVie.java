package fr.diginamic.automates;

import java.util.Arrays;

public class JeuDeLaVie {
	
	private Cellule[][] playground;

	public static void main(String[] args) {
		
		
		JeuDeLaVie game = new JeuDeLaVie(20, 20, 0);
		while(!game.isEveryoneDead()) {
			System.out.println(game);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.err.println(e);
			}
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
				if(playground[x + i][y + j] != null && playground[x + i][y + j].isAlive())
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
		return "JeuDeLaVie [playground=" + Arrays.toString(playground) + "]";
	}

	
	
	

}
