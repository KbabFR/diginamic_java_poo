package fr.diginamic.automates;

public class Cellule {
	
	private boolean alive;
	

	public Cellule(boolean alive) {
		this.alive = alive;
	}
	
	
	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	/** check and return if the cell still alive
	 * @param voisinage
	 * @return boolean [true] if cell is alive
	 */
	public boolean turn(int voisine) {
		if(voisine < 2 || 3 < voisine)
			alive = false;
		else if(voisine == 3)
			alive = true;
		return alive;
	}


	@Override
	public String toString() {
		if(alive)
			return "X";
		else
			return " ";
	}
	
	

}
